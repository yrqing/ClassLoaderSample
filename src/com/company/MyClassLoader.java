package com.company;

import java.io.*;

public class MyClassLoader extends ClassLoader {

    public Class findClass(String name) {
        byte[] b = loadClassData(name);
        if (b == null) {
            return null;
        }
        return defineClass(name, b, 0, b.length);
    }

    private byte[] loadClassData(String name) {

        try {
            String replace = name.replace('.', '/');
            System.out.println("replace=" + replace);

            InputStream is = new FileInputStream("/Users/yuerq/IdeaProjects/" + replace + ".class");
            ByteArrayOutputStream bos = new ByteArrayOutputStream();

            byte[] buf = new byte[1024];
            int n;
            while ((n = is.read(buf)) != -1) {
                bos.write(buf, 0, n);
            }

            is.close();

            return bos.toByteArray();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}

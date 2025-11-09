package org.apache.tika.utils;

/* loaded from: classes3.dex */
public class CompareUtils {
    public static int compareClassName(Object obj, Object obj2) {
        String name = obj.getClass().getName();
        String name2 = obj2.getClass().getName();
        boolean zStartsWith = name.startsWith("org.apache.tika.");
        return zStartsWith == name2.startsWith("org.apache.tika.") ? name.compareTo(name2) : zStartsWith ? 1 : -1;
    }
}

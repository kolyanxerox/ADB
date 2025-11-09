package com.unity3d.services.core.network.domain;

import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.OooOo;
import o000O00.o00O0O0O;
import o00O0.oo000o;
import o00O0Oo0.o00Oo0;
import o00O0Oo0.o00Ooo;
import o00O0o.OooOo00;
import o00O0o.Oooo0;
import o00O0o.o0OoOo0;
import o00Oo0oo.o00oO0o;
import oo00o.OooOO0;

/* loaded from: classes3.dex */
public final class CleanupDirectory {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v12, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r15v3, types: [com.unity3d.services.core.network.domain.CleanupDirectory$invoke$$inlined$sortedBy$1] */
    public final void invoke(File directory, int i, long j) {
        ?? r12;
        OooOo.OooO0o0(directory, "directory");
        if (!directory.exists() || !directory.isDirectory()) {
            throw new IllegalArgumentException(("Directory does not exist or is not a directory: " + directory).toString());
        }
        OooOo00 oooOo00Oooo0O0 = o0OoOo0.Oooo0O0(new o00Oo0(directory, o00Ooo.f31394OooOo0O), CleanupDirectory$invoke$cachedFiles$1.INSTANCE);
        o00O0Oo0.o0OoOo0 o0oooo0 = new o00O0Oo0.o0OoOo0(oooOo00Oooo0O0);
        long length = 0;
        long length2 = 0;
        while (o0oooo0.hasNext()) {
            length2 += ((File) o0oooo0.next()).length();
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        o00O0Oo0.o0OoOo0 o0oooo02 = new o00O0Oo0.o0OoOo0(oooOo00Oooo0O0);
        while (o0oooo02.hasNext()) {
            Object next = o0oooo02.next();
            if (((File) next).lastModified() + j < jCurrentTimeMillis) {
                arrayList.add(next);
            } else {
                arrayList2.add(next);
            }
        }
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            length += ((File) obj).length();
        }
        long j2 = length2 - length;
        int size2 = arrayList.size();
        while (i2 < size2) {
            Object obj2 = arrayList.get(i2);
            i2++;
            ((File) obj2).delete();
        }
        long j3 = i * 1048576;
        if (j2 > j3) {
            o00Oo0 o00oo0 = new o00Oo0(new o00O0.o00Oo0(arrayList2, 0), (CleanupDirectory$invoke$$inlined$sortedBy$1) new Comparator() { // from class: com.unity3d.services.core.network.domain.CleanupDirectory$invoke$$inlined$sortedBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return o00oO0o.OooO0Oo(Long.valueOf(((File) t).lastModified()), Long.valueOf(((File) t2).lastModified()));
                }
            });
            OooOO0 oooOO0 = new OooOO0(Long.valueOf(j2), oo000o.f31251OooOo0O);
            CleanupDirectory$invoke$additionalFiles$2 operation = CleanupDirectory$invoke$additionalFiles$2.INSTANCE;
            OooOo.OooO0o0(operation, "operation");
            Object obj3 = null;
            Oooo0 oooo0OooOo00 = o00O0O0O.OooOo00(new o00O0o.o00Ooo(oooOO0, o00oo0, operation, null));
            while (true) {
                if (!oooo0OooOo00.hasNext()) {
                    break;
                }
                Object next2 = oooo0OooOo00.next();
                if (((Number) ((OooOO0) next2).f33185OooOo0O).longValue() <= j3) {
                    obj3 = next2;
                    break;
                }
            }
            OooOO0 oooOO02 = (OooOO0) obj3;
            if (oooOO02 != null && (r12 = (List) oooOO02.f33186OooOo0o) != 0) {
                arrayList2 = r12;
            }
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                ((File) it.next()).delete();
            }
        }
    }
}

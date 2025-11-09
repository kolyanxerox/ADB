package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes2.dex */
public final class oOOO00 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final int f22821OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final byte[] f22822OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final Map f22823OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final List f22824OooO0Oo;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final boolean f22825OooO0o0;

    public oOOO00(int i, byte[] bArr, Map map, List list, boolean z) {
        this.f22821OooO00o = i;
        this.f22822OooO0O0 = bArr;
        this.f22823OooO0OO = map;
        this.f22824OooO0Oo = list == null ? null : Collections.unmodifiableList(list);
        this.f22825OooO0o0 = z;
    }

    public static List OooO00o(Map map) {
        if (map == null) {
            return null;
        }
        if (map.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(new oOO0OoO0((String) entry.getKey(), (String) entry.getValue()));
        }
        return arrayList;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.TreeMap] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    public oOOO00(int i, byte[] bArr, boolean z, List list) {
        Map treeMap;
        if (list == null) {
            treeMap = 0;
        } else if (list.isEmpty()) {
            treeMap = Collections.EMPTY_MAP;
        } else {
            treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                oOO0OoO0 ooo0ooo0 = (oOO0OoO0) it.next();
                treeMap.put(ooo0ooo0.f22819OooO00o, ooo0ooo0.f22820OooO0O0);
            }
        }
        this(i, bArr, treeMap, list, z);
    }
}

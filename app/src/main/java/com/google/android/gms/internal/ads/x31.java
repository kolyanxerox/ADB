package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes2.dex */
public final class x31 implements q31 {

    /* renamed from: OooO0OO, reason: collision with root package name */
    public static final /* synthetic */ int f25505OooO0OO = 0;

    /* renamed from: OooO00o, reason: collision with root package name */
    public final List f25506OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final List f25507OooO0O0;

    static {
        r31.OooO00o(Collections.EMPTY_SET);
    }

    public /* synthetic */ x31(List list, List list2) {
        this.f25506OooO00o = list;
        this.f25507OooO0O0 = list2;
    }

    public static dx0 OooO00o(int i, int i2) {
        return new dx0(i, i2);
    }

    @Override // com.google.android.gms.internal.ads.z31
    /* renamed from: OooO0O0, reason: merged with bridge method [inline-methods] */
    public final Set zzb() {
        List list = this.f25506OooO00o;
        int size = list.size();
        List list2 = this.f25507OooO0O0;
        ArrayList arrayList = new ArrayList(list2.size());
        int size2 = list2.size();
        for (int i = 0; i < size2; i++) {
            Collection collection = (Collection) ((v31) list2.get(i)).zzb();
            size += collection.size();
            arrayList.add(collection);
        }
        HashSet hashSet = new HashSet(size < 3 ? size + 1 : size < 1073741824 ? (int) ((size / 0.75f) + 1.0f) : Integer.MAX_VALUE);
        int size3 = list.size();
        for (int i2 = 0; i2 < size3; i2++) {
            Object objZzb = ((v31) list.get(i2)).zzb();
            objZzb.getClass();
            hashSet.add(objZzb);
        }
        int size4 = arrayList.size();
        for (int i3 = 0; i3 < size4; i3++) {
            for (Object obj : (Collection) arrayList.get(i3)) {
                obj.getClass();
                hashSet.add(obj);
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }
}

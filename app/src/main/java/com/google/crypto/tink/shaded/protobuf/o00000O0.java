package com.google.crypto.tink.shaded.protobuf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class o00000O0 extends o00000OO {

    /* renamed from: OooO0OO */
    public static final Class f28073OooO0OO = Collections.unmodifiableList(Collections.EMPTY_LIST).getClass();

    public static List OooO0Oo(Object obj, int i, long j) {
        List list = (List) oOO00O.f28126OooO0OO.OooO(obj, j);
        if (list.isEmpty()) {
            List o000000o2 = list instanceof o00000 ? new o000000O(i) : ((list instanceof o000O00O) && (list instanceof o0OO00O)) ? ((o0OO00O) list).mutableCopyWithCapacity(i) : new ArrayList(i);
            oOO00O.OooOOOo(obj, j, o000000o2);
            return o000000o2;
        }
        if (f28073OooO0OO.isAssignableFrom(list.getClass())) {
            ArrayList arrayList = new ArrayList(list.size() + i);
            arrayList.addAll(list);
            oOO00O.OooOOOo(obj, j, arrayList);
            return arrayList;
        }
        if (list instanceof o00oOoo) {
            o000000O o000000o3 = new o000000O(list.size() + i);
            o000000o3.addAll((o00oOoo) list);
            oOO00O.OooOOOo(obj, j, o000000o3);
            return o000000o3;
        }
        if ((list instanceof o000O00O) && (list instanceof o0OO00O)) {
            o0OO00O o0oo00o = (o0OO00O) list;
            if (!((OooO0O0) o0oo00o).f28011OooOo0O) {
                o0OO00O o0oo00oMutableCopyWithCapacity = o0oo00o.mutableCopyWithCapacity(list.size() + i);
                oOO00O.OooOOOo(obj, j, o0oo00oMutableCopyWithCapacity);
                return o0oo00oMutableCopyWithCapacity;
            }
        }
        return list;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o00000OO
    public final void OooO00o(Object obj, long j) {
        Object objUnmodifiableList;
        List list = (List) oOO00O.f28126OooO0OO.OooO(obj, j);
        if (list instanceof o00000) {
            objUnmodifiableList = ((o00000) list).getUnmodifiableView();
        } else {
            if (f28073OooO0OO.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof o000O00O) && (list instanceof o0OO00O)) {
                OooO0O0 oooO0O0 = (OooO0O0) ((o0OO00O) list);
                if (oooO0O0.f28011OooOo0O) {
                    oooO0O0.f28011OooOo0O = false;
                    return;
                }
                return;
            }
            objUnmodifiableList = Collections.unmodifiableList(list);
        }
        oOO00O.OooOOOo(obj, j, objUnmodifiableList);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o00000OO
    public final void OooO0O0(Object obj, Object obj2, long j) {
        List list = (List) oOO00O.f28126OooO0OO.OooO(obj2, j);
        List listOooO0Oo = OooO0Oo(obj, list.size(), j);
        int size = listOooO0Oo.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            listOooO0Oo.addAll(list);
        }
        if (size > 0) {
            list = listOooO0Oo;
        }
        oOO00O.OooOOOo(obj, j, list);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o00000OO
    public final List OooO0OO(Object obj, long j) {
        return OooO0Oo(obj, 10, j);
    }
}

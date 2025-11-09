package com.google.protobuf;

import com.google.protobuf.Internal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class o00OO000 extends o00OO0O0 {

    /* renamed from: OooO0OO, reason: collision with root package name */
    public static final Class f28270OooO0OO = Collections.unmodifiableList(Collections.EMPTY_LIST).getClass();

    public static List OooO0Oo(Object obj, int i, long j) {
        List list = (List) o0OO.f28347OooO0OO.OooOOO0(obj, j);
        if (list.isEmpty()) {
            List lazyStringArrayList = list instanceof LazyStringList ? new LazyStringArrayList(i) : ((list instanceof o0O00O0o) && (list instanceof Internal.ProtobufList)) ? ((Internal.ProtobufList) list).mutableCopyWithCapacity2(i) : new ArrayList(i);
            o0OO.OooOOoo(obj, j, lazyStringArrayList);
            return lazyStringArrayList;
        }
        if (f28270OooO0OO.isAssignableFrom(list.getClass())) {
            ArrayList arrayList = new ArrayList(list.size() + i);
            arrayList.addAll(list);
            o0OO.OooOOoo(obj, j, arrayList);
            return arrayList;
        }
        if (list instanceof UnmodifiableLazyStringList) {
            LazyStringArrayList lazyStringArrayList2 = new LazyStringArrayList(list.size() + i);
            lazyStringArrayList2.addAll((UnmodifiableLazyStringList) list);
            o0OO.OooOOoo(obj, j, lazyStringArrayList2);
            return lazyStringArrayList2;
        }
        if ((list instanceof o0O00O0o) && (list instanceof Internal.ProtobufList)) {
            Internal.ProtobufList protobufList = (Internal.ProtobufList) list;
            if (!protobufList.isModifiable()) {
                Internal.ProtobufList protobufListMutableCopyWithCapacity2 = protobufList.mutableCopyWithCapacity2(list.size() + i);
                o0OO.OooOOoo(obj, j, protobufListMutableCopyWithCapacity2);
                return protobufListMutableCopyWithCapacity2;
            }
        }
        return list;
    }

    @Override // com.google.protobuf.o00OO0O0
    public final void OooO00o(Object obj, long j) {
        Object objUnmodifiableList;
        List list = (List) o0OO.f28347OooO0OO.OooOOO0(obj, j);
        if (list instanceof LazyStringList) {
            objUnmodifiableList = ((LazyStringList) list).getUnmodifiableView();
        } else {
            if (f28270OooO0OO.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof o0O00O0o) && (list instanceof Internal.ProtobufList)) {
                Internal.ProtobufList protobufList = (Internal.ProtobufList) list;
                if (protobufList.isModifiable()) {
                    protobufList.makeImmutable();
                    return;
                }
                return;
            }
            objUnmodifiableList = Collections.unmodifiableList(list);
        }
        o0OO.OooOOoo(obj, j, objUnmodifiableList);
    }

    @Override // com.google.protobuf.o00OO0O0
    public final void OooO0O0(Object obj, Object obj2, long j) {
        List list = (List) o0OO.f28347OooO0OO.OooOOO0(obj2, j);
        List listOooO0Oo = OooO0Oo(obj, list.size(), j);
        int size = listOooO0Oo.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            listOooO0Oo.addAll(list);
        }
        if (size > 0) {
            list = listOooO0Oo;
        }
        o0OO.OooOOoo(obj, j, list);
    }

    @Override // com.google.protobuf.o00OO0O0
    public final List OooO0OO(Object obj, long j) {
        return OooO0Oo(obj, 10, j);
    }
}

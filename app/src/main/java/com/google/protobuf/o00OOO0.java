package com.google.protobuf;

import com.unity3d.services.core.fid.Constants;
import java.util.ArrayDeque;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class o00OOO0 {

    /* renamed from: OooO0O0, reason: collision with root package name */
    public static final o00O00OO f28274OooO0O0 = new o00O00OO(1);

    /* renamed from: OooO00o, reason: collision with root package name */
    public final Object f28275OooO00o;

    public o00OOO0(int i) {
        o0oOO o0ooo;
        switch (i) {
            case 1:
                this.f28275OooO00o = new ArrayDeque();
                break;
            default:
                try {
                    o0ooo = (o0oOO) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod(Constants.GET_INSTANCE, null).invoke(null, null);
                } catch (Exception unused) {
                    o0ooo = f28274OooO0O0;
                }
                o0oOO[] o0oooArr = {o00O00OO.f28255OooO0O0, o0ooo};
                o00OOO00 o00ooo00 = new o00OOO00();
                o00ooo00.f28276OooO00o = o0oooArr;
                this.f28275OooO00o = (o0oOO) Internal.checkNotNull(o00ooo00, "messageInfoFactory");
                break;
        }
    }

    public void OooO00o(ByteString byteString) {
        if (!byteString.isBalanced()) {
            if (!(byteString instanceof o0O0O0O)) {
                throw new IllegalArgumentException("Has a new type of ByteString been created? Found " + byteString.getClass());
            }
            o0O0O0O o0o0o0o = (o0O0O0O) byteString;
            OooO00o(o0o0o0o.f28314OooOo0o);
            OooO00o(o0o0o0o.f28312OooOo);
            return;
        }
        int iBinarySearch = Arrays.binarySearch(o0O0O0O.f28311OooOoOO, byteString.size());
        if (iBinarySearch < 0) {
            iBinarySearch = (-(iBinarySearch + 1)) - 1;
        }
        int iOooO0o0 = o0O0O0O.OooO0o0(iBinarySearch + 1);
        ArrayDeque arrayDeque = (ArrayDeque) this.f28275OooO00o;
        if (arrayDeque.isEmpty() || ((ByteString) arrayDeque.peek()).size() >= iOooO0o0) {
            arrayDeque.push(byteString);
            return;
        }
        int iOooO0o02 = o0O0O0O.OooO0o0(iBinarySearch);
        ByteString o0o0o0o2 = (ByteString) arrayDeque.pop();
        while (!arrayDeque.isEmpty() && ((ByteString) arrayDeque.peek()).size() < iOooO0o02) {
            o0o0o0o2 = new o0O0O0O((ByteString) arrayDeque.pop(), o0o0o0o2);
        }
        o0O0O0O o0o0o0o3 = new o0O0O0O(o0o0o0o2, byteString);
        while (!arrayDeque.isEmpty()) {
            int iBinarySearch2 = Arrays.binarySearch(o0O0O0O.f28311OooOoOO, o0o0o0o3.f28313OooOo0O);
            if (iBinarySearch2 < 0) {
                iBinarySearch2 = (-(iBinarySearch2 + 1)) - 1;
            }
            if (((ByteString) arrayDeque.peek()).size() >= o0O0O0O.OooO0o0(iBinarySearch2 + 1)) {
                break;
            } else {
                o0o0o0o3 = new o0O0O0O((ByteString) arrayDeque.pop(), o0o0o0o3);
            }
        }
        arrayDeque.push(o0o0o0o3);
    }
}

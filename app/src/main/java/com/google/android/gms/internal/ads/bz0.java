package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public abstract class bz0 {
    protected int zzq;

    public static void OooO0OO(Iterable iterable, List list) {
        Charset charset = i01.f19888OooO00o;
        iterable.getClass();
        if (iterable instanceof n01) {
            List listZza = ((n01) iterable).zza();
            if (list != null) {
                throw new ClassCastException();
            }
            list.size();
            Iterator it = listZza.iterator();
            if (it.hasNext()) {
                Object next = it.next();
                next.getClass();
                if (next instanceof jz0) {
                    throw null;
                }
                if (!(next instanceof byte[])) {
                    throw null;
                }
                byte[] bArr = (byte[]) next;
                jz0.OooOo0(bArr, 0, bArr.length);
                throw null;
            }
            return;
        }
        if (iterable instanceof z01) {
            list.addAll((Collection) iterable);
            return;
        }
        if (iterable instanceof Collection) {
            int size = ((Collection) iterable).size();
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(list.size() + size);
            } else if (list instanceof b11) {
                b11 b11Var = (b11) list;
                int i = ((b11) list).f17346OooOo + size;
                int length = b11Var.f17347OooOo0o.length;
                if (i > length) {
                    if (length != 0) {
                        while (length < i) {
                            length = AbstractC2183w4.OooOO0(length, 3, 2, 1, 10);
                        }
                        b11Var.f17347OooOo0o = Arrays.copyOf(b11Var.f17347OooOo0o, length);
                    } else {
                        b11Var.f17347OooOo0o = new Object[Math.max(i, 10)];
                    }
                }
            }
        }
        int size2 = list.size();
        if (!(iterable instanceof List) || !(iterable instanceof RandomAccess)) {
            for (Object obj : iterable) {
                if (obj == null) {
                    xz0.OooO0o0(size2, list);
                    throw null;
                }
                list.add(obj);
            }
            return;
        }
        List list2 = (List) iterable;
        int size3 = list2.size();
        for (int i2 = 0; i2 < size3; i2++) {
            Object obj2 = list2.get(i2);
            if (obj2 == null) {
                xz0.OooO0o0(size2, list);
                throw null;
            }
            list.add(obj2);
        }
    }

    public abstract int OooO00o(g11 g11Var);

    public final hz0 OooO0O0() {
        try {
            int iOooO00o = ((zz0) this).OooO00o(null);
            hz0 hz0Var = jz0.f20406OooOo0o;
            byte[] bArr = new byte[iOooO00o];
            oz0 oz0Var = new oz0(bArr, iOooO00o);
            ((zz0) this).OooOOo0(oz0Var);
            if (iOooO00o - oz0Var.f23166OooOoo0 == 0) {
                return new hz0(bArr);
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            throw new RuntimeException(OooO0o0("ByteString"), e);
        }
    }

    public final byte[] OooO0Oo() {
        try {
            int iOooO00o = ((zz0) this).OooO00o(null);
            byte[] bArr = new byte[iOooO00o];
            oz0 oz0Var = new oz0(bArr, iOooO00o);
            ((zz0) this).OooOOo0(oz0Var);
            if (iOooO00o - oz0Var.f23166OooOoo0 == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            throw new RuntimeException(OooO0o0("byte array"), e);
        }
    }

    public final String OooO0o0(String str) {
        return OooO0oO.OooOo.OooOO0o("Serializing ", getClass().getName(), " to a ", str, " threw an IOException (should never happen).");
    }
}

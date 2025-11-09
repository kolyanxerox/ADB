package com.google.android.gms.internal.play_billing;

import com.google.android.gms.internal.ads.AbstractC2183w4;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public final class o00OOOO0 extends o0OoO00O {
    private static final o00OOOO0 zzb;
    private o0O00OOO zzd = o0O.f27071OooOoO;

    static {
        o00OOOO0 o00oooo0 = new o00OOOO0();
        zzb = o00oooo0;
        o0OoO00O.OooOO0O(o00OOOO0.class, o00oooo0);
    }

    public static o0o0Oo OooOOO() {
        return (o0o0Oo) zzb.OooO0o();
    }

    public static void OooOOOO(o00OOOO0 o00oooo0, Iterable iterable) {
        o0O00OOO o0o00ooo = o00oooo0.zzd;
        if (!((oo00oO) o0o00ooo).f27207OooOo0O) {
            int size = o0o00ooo.size();
            o00oooo0.zzd = o0o00ooo.OooO0OO(size + size);
        }
        List list = o00oooo0.zzd;
        Charset charset = o0oO0Ooo.f27160OooO00o;
        iterable.getClass();
        if (iterable instanceof o0oO0O0o) {
            List listZza = ((o0oO0O0o) iterable).zza();
            if (list != null) {
                throw new ClassCastException();
            }
            list.size();
            Iterator it = listZza.iterator();
            if (it.hasNext()) {
                Object next = it.next();
                next.getClass();
                if (next instanceof o0O00000) {
                    throw null;
                }
                if (!(next instanceof byte[])) {
                    throw null;
                }
                byte[] bArr = (byte[]) next;
                o0O00000.OooOO0(bArr, 0, bArr.length);
                throw null;
            }
            return;
        }
        if (iterable instanceof o0oOo0O0) {
            list.addAll((Collection) iterable);
            return;
        }
        if (iterable instanceof Collection) {
            int size2 = ((Collection) iterable).size();
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(list.size() + size2);
            }
            if (list instanceof o0O) {
                o0O o0o = (o0O) list;
                int i = ((o0O) list).f27073OooOo + size2;
                int length = o0o.f27074OooOo0o.length;
                if (i > length) {
                    if (length != 0) {
                        while (length < i) {
                            length = AbstractC2183w4.OooOO0(length, 3, 2, 1, 10);
                        }
                        o0o.f27074OooOo0o = Arrays.copyOf(o0o.f27074OooOo0o, length);
                    } else {
                        o0o.f27074OooOo0o = new Object[Math.max(i, 10)];
                    }
                }
            }
        }
        int size3 = list.size();
        if (!(iterable instanceof List) || !(iterable instanceof RandomAccess)) {
            for (Object obj : iterable) {
                if (obj == null) {
                    o0O00.OooO00o(size3, list);
                    throw null;
                }
                list.add(obj);
            }
            return;
        }
        List list2 = (List) iterable;
        int size4 = list2.size();
        for (int i2 = 0; i2 < size4; i2++) {
            Object obj2 = list2.get(i2);
            if (obj2 == null) {
                o0O00.OooO00o(size3, list);
                throw null;
            }
            list.add(obj2);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.o0OoO00O
    public final Object OooO0Oo(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new o0OO000(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", o00OOO0O.class});
        }
        if (i2 == 3) {
            return new o00OOOO0();
        }
        if (i2 == 4) {
            return new o0o0Oo(zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}

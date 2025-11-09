package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.ads.AbstractC2183w4;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.o */
/* loaded from: classes2.dex */
public abstract class AbstractC2346o {
    protected int zza;

    public static void OooO0OO(Iterable iterable, List list) {
        Charset charset = oO00O0o.f26684OooO00o;
        iterable.getClass();
        if (iterable instanceof oO00OOO) {
            List listZza = ((oO00OOO) iterable).zza();
            if (list != null) {
                throw new ClassCastException();
            }
            list.size();
            Iterator it = listZza.iterator();
            if (it.hasNext()) {
                Object next = it.next();
                next.getClass();
                if (next instanceof oO000) {
                    throw null;
                }
                if (!(next instanceof byte[])) {
                    throw null;
                }
                byte[] bArr = (byte[]) next;
                oO000.OooO(bArr, 0, bArr.length);
                throw null;
            }
            return;
        }
        if (iterable instanceof oO0OO00o) {
            list.addAll((Collection) iterable);
            return;
        }
        if (iterable instanceof Collection) {
            int size = ((Collection) iterable).size();
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(list.size() + size);
            } else if (list instanceof oOo0000O) {
                oOo0000O ooo0000o = (oOo0000O) list;
                int i = ((oOo0000O) list).f26875OooOo + size;
                int length = ooo0000o.f26876OooOo0o.length;
                if (i > length) {
                    if (length != 0) {
                        while (length < i) {
                            length = AbstractC2183w4.OooOO0(length, 3, 2, 1, 10);
                        }
                        ooo0000o.f26876OooOo0o = Arrays.copyOf(ooo0000o.f26876OooOo0o, length);
                    } else {
                        ooo0000o.f26876OooOo0o = new Object[Math.max(i, 10)];
                    }
                }
            }
        }
        int size2 = list.size();
        if (!(iterable instanceof List) || !(iterable instanceof RandomAccess)) {
            for (Object obj : iterable) {
                if (obj == null) {
                    oO000OOo.OooO00o(size2, list);
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
                oO000OOo.OooO00o(size2, list);
                throw null;
            }
            list.add(obj2);
        }
    }

    public final byte[] OooO00o() {
        try {
            ooOOOOoo oooooooo = (ooOOOOoo) this;
            int iOooOO0O = oooooooo.OooOO0O();
            byte[] bArr = new byte[iOooOO0O];
            oO000O0 oo000o0 = new oO000O0(bArr, iOooOO0O);
            oooooooo.OooO0Oo(oo000o0);
            if (iOooOO0O - oo000o0.f26679OooO0oO == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            String name = getClass().getName();
            throw new RuntimeException(androidx.datastore.preferences.protobuf.OooO00o.OooOOO0(new StringBuilder(name.length() + 72), "Serializing ", name, " to a byte array threw an IOException (should never happen)."), e);
        }
    }

    public abstract int OooO0O0(oO0 oo0);
}

package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class hr0 implements pq0 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final bi0 f19844OooO00o;

    public hr0(bi0 bi0Var) throws GeneralSecurityException {
        this.f19844OooO00o = bi0Var;
        if (((wt0) bi0Var.f17510OooOoO0).f25408OooO00o.isEmpty()) {
            return;
        }
        bu0 bu0Var = (bu0) cu0.f18058OooO0O0.f18060OooO00o.get();
        bu0Var = bu0Var == null ? cu0.f18059OooO0OO : bu0Var;
        ii0.OooOO0o(bi0Var);
        bu0Var.getClass();
    }

    @Override // com.google.android.gms.internal.ads.pq0
    public final byte[] OooO00o(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        HashMap map = (HashMap) this.f19844OooO00o.f17509OooOo0o;
        if (length > 5) {
            List list = (List) map.get(az0.OooO00o(Arrays.copyOf(bArr, 5)));
            if (list == null) {
                list = Collections.EMPTY_LIST;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                try {
                    return ((pq0) ((qu0) it.next()).f23702OooO00o).OooO00o(bArr, bArr2);
                } catch (GeneralSecurityException unused) {
                }
            }
        }
        List list2 = (List) map.get(az0.OooO00o(af0.f17032OooO0o));
        if (list2 == null) {
            list2 = Collections.EMPTY_LIST;
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            try {
                return ((pq0) ((qu0) it2.next()).f23702OooO00o).OooO00o(bArr, bArr2);
            } catch (GeneralSecurityException unused2) {
            }
        }
        throw new GeneralSecurityException("decryption failed");
    }
}

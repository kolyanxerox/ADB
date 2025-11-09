package com.google.android.gms.internal.ads;

import android.os.Handler;
import com.google.android.gms.tasks.OnFailureListener;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes2.dex */
public final /* synthetic */ class ni0 implements OnFailureListener, uy0, il0, InterfaceC1770kz, k81 {

    /* renamed from: OooOo0O */
    public final /* synthetic */ int f21492OooOo0O;

    /* renamed from: OooOo0o */
    public final Object f21493OooOo0o;

    public /* synthetic */ ni0(d61 d61Var, g41 g41Var) {
        this.f21492OooOo0O = 7;
        this.f21493OooOo0o = g41Var;
    }

    public static ni0 OooO0O0(uk0 uk0Var) {
        return new ni0(new rh0(uk0Var), 1);
    }

    public void OooO00o(Exception exc) {
        AbstractC1641hg.OooOOO0("MediaCodecAudioRenderer", "Audio sink error", exc);
        o00O0O o00o0o = ((i71) this.f21493OooOo0o).f19978o0000O0O;
        Handler handler = o00o0o.f21767OooO00o;
        if (handler != null) {
            handler.post(new u61(o00o0o, exc, 6));
        }
    }

    public void OooO0OO(jz0 jz0Var) {
        if (!jz0Var.OooOOO0()) {
            if (!(jz0Var instanceof f11)) {
                throw new IllegalArgumentException("Has a new type of ByteString been created? Found ".concat(String.valueOf(jz0Var.getClass())));
            }
            f11 f11Var = (f11) jz0Var;
            OooO0OO(f11Var.f18759OooOoO0);
            OooO0OO(f11Var.f18758OooOoO);
            return;
        }
        int iBinarySearch = Arrays.binarySearch(f11.f18756OooOoo, jz0Var.OooOO0());
        if (iBinarySearch < 0) {
            iBinarySearch = (-(iBinarySearch + 1)) - 1;
        }
        ArrayDeque arrayDeque = (ArrayDeque) this.f21493OooOo0o;
        int iOooOo0o = f11.OooOo0o(iBinarySearch + 1);
        if (arrayDeque.isEmpty() || ((jz0) arrayDeque.peek()).OooOO0() >= iOooOo0o) {
            arrayDeque.push(jz0Var);
            return;
        }
        int iOooOo0o2 = f11.OooOo0o(iBinarySearch);
        jz0 f11Var2 = (jz0) arrayDeque.pop();
        while (!arrayDeque.isEmpty() && ((jz0) arrayDeque.peek()).OooOO0() < iOooOo0o2) {
            f11Var2 = new f11((jz0) arrayDeque.pop(), f11Var2);
        }
        f11 f11Var3 = new f11(f11Var2, jz0Var);
        while (!arrayDeque.isEmpty()) {
            int iBinarySearch2 = Arrays.binarySearch(f11.f18756OooOoo, f11Var3.f18757OooOo);
            if (iBinarySearch2 < 0) {
                iBinarySearch2 = (-(iBinarySearch2 + 1)) - 1;
            }
            if (((jz0) arrayDeque.peek()).OooOO0() >= f11.OooOo0o(iBinarySearch2 + 1)) {
                break;
            } else {
                f11Var3 = new f11((jz0) arrayDeque.pop(), f11Var3);
            }
        }
        arrayDeque.push(f11Var3);
    }

    public List OooO0Oo(CharSequence charSequence) {
        charSequence.getClass();
        Iterator itOooO0Oo = ((hl0) this.f21493OooOo0o).OooO0Oo(this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (true) {
            gl0 gl0Var = (gl0) itOooO0Oo;
            if (!gl0Var.hasNext()) {
                return Collections.unmodifiableList(arrayList);
            }
            arrayList.add((String) gl0Var.next());
        }
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        OooOOo0.o0OOO0o o0ooo0o = (OooOOo0.o0OOO0o) this.f21493OooOo0o;
        o0ooo0o.getClass();
        if (exc instanceof InterruptedException) {
            Thread.currentThread().interrupt();
        }
        ((OoooOOO.o0O0oo00) o0ooo0o.f13520OooOoO0).OooO0oO(2025, -1L, exc);
    }

    @Override // com.google.android.gms.internal.ads.il0
    /* renamed from: zza */
    public Object mo13704zza() {
        switch (this.f21492OooOo0O) {
            case 4:
                return (C1847n1) this.f21493OooOo0o;
            default:
                return (xa1) this.f21493OooOo0o;
        }
    }

    public /* synthetic */ ni0(d61 d61Var, Object obj, long j) {
        this.f21492OooOo0O = 8;
        this.f21493OooOo0o = obj;
    }

    public /* synthetic */ ni0(Object obj, int i) {
        this.f21492OooOo0O = i;
        this.f21493OooOo0o = obj;
    }

    @Override // com.google.android.gms.internal.ads.k81
    public int zza(Object obj) {
        c81 c81Var = (c81) obj;
        HashMap map = m81.f21145OooO00o;
        c81Var.getClass();
        o0OoOo0 o0oooo0 = (o0OoOo0) this.f21493OooOo0o;
        String str = o0oooo0.f22222OooOOO0;
        String str2 = c81Var.f17959OooO0O0;
        return ((str2.equals(str) || str2.equals(m81.OooO00o(o0oooo0))) && c81Var.OooO(o0oooo0, false)) ? 1 : 0;
    }

    public ni0(int i) {
        this.f21492OooOo0O = i;
        switch (i) {
            case 11:
                this.f21493OooOo0o = new CopyOnWriteArrayList();
                break;
            default:
                this.f21493OooOo0o = new ArrayDeque();
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.uy0
    public Object zza(String str) throws GeneralSecurityException {
        String[] strArr = {"GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt"};
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (int i2 = 0; i2 < 3; i2++) {
            Provider provider = Security.getProvider(strArr[i2]);
            if (provider != null) {
                arrayList.add(provider);
            }
        }
        int size = arrayList.size();
        Exception exc = null;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            try {
                return ((qv0) this.f21493OooOo0o).OooO0o(str, (Provider) obj);
            } catch (Exception e) {
                if (exc == null) {
                    exc = e;
                }
            }
        }
        throw new GeneralSecurityException("No good Provider found.", exc);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1770kz
    /* renamed from: zza */
    public void mo13701zza(Object obj) {
        e61 e61Var = (e61) obj;
        switch (this.f21492OooOo0O) {
            case 7:
                e61Var.OooOOO0((g41) this.f21493OooOo0o);
                break;
            default:
                e61Var.OooOOOO();
                break;
        }
    }
}

package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes2.dex */
public final class yy0 extends ThreadLocal {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f26042OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Object f26043OooO0O0;

    public /* synthetic */ yy0(Object obj, int i) {
        this.f26042OooO00o = i;
        this.f26043OooO0O0 = obj;
    }

    @Override // java.lang.ThreadLocal
    public final Object initialValue() throws InvalidKeyException {
        switch (this.f26042OooO00o) {
            case 0:
                b40 b40Var = (b40) this.f26043OooO0O0;
                try {
                    vy0 vy0Var = vy0.f25143OooO0OO;
                    Mac mac = (Mac) vy0Var.f25144OooO00o.zza((String) b40Var.f17367OooO0OO);
                    mac.init((SecretKeySpec) b40Var.f17368OooO0Oo);
                    return mac;
                } catch (GeneralSecurityException e) {
                    throw new IllegalStateException(e);
                }
            default:
                OooO0oO.OooOOO oooOOO = (OooO0oO.OooOOO) this.f26043OooO0O0;
                try {
                    o0000Oo.Oooo0 oooo0 = o0000Oo.Oooo0.f29464OooO0OO;
                    Mac mac2 = (Mac) oooo0.f29465OooO00o.OooO00o((String) oooOOO.f13274OooOo);
                    mac2.init((SecretKeySpec) oooOOO.f13277OooOoO0);
                    return mac2;
                } catch (GeneralSecurityException e2) {
                    throw new IllegalStateException(e2);
                }
        }
    }
}

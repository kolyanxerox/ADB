package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzv;
import java.util.LinkedList;

/* loaded from: classes2.dex */
public final class ie0 {

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final int f20033OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final int f20034OooO0OO;

    /* renamed from: OooO00o, reason: collision with root package name */
    public final LinkedList f20032OooO00o = new LinkedList();

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final we0 f20035OooO0Oo = new we0();

    public ie0(int i, int i2) {
        this.f20033OooO0O0 = i;
        this.f20034OooO0OO = i2;
    }

    public final void OooO00o() {
        while (true) {
            LinkedList linkedList = this.f20032OooO00o;
            if (linkedList.isEmpty()) {
                return;
            }
            oe0 oe0Var = (oe0) linkedList.getFirst();
            ((Oooo0OO.oo000o) zzv.zzC()).getClass();
            if (System.currentTimeMillis() - oe0Var.f22982OooO0Oo < this.f20034OooO0OO) {
                return;
            }
            we0 we0Var = this.f20035OooO0Oo;
            we0Var.f25302OooO0o++;
            we0Var.f25299OooO0O0.f24970OooOo0o++;
            linkedList.remove();
        }
    }
}

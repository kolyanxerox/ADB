package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class o0O0OOO0 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public int f21961OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public int f21962OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public Cloneable f21963OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public Object f21964OooO0Oo;

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Cloneable, long[]] */
    public o0O0OOO0() {
        this.f21963OooO0OO = new long[10];
        this.f21964OooO0Oo = new Object[10];
    }

    public synchronized int OooO00o() {
        return this.f21962OooO0O0;
    }

    public synchronized Object OooO0O0() {
        if (this.f21962OooO0O0 == 0) {
            return null;
        }
        return OooO0oO();
    }

    public synchronized Object OooO0OO(long j) {
        Object objOooO0oO;
        objOooO0oO = null;
        while (this.f21962OooO0O0 > 0 && j - ((long[]) this.f21963OooO0OO)[this.f21961OooO00o] >= 0) {
            objOooO0oO = OooO0oO();
        }
        return objOooO0oO;
    }

    public synchronized void OooO0Oo() {
        try {
            ij0 ij0Var = (ij0) this.f21964OooO0Oo;
            if (ij0Var.f20050OooO0O0) {
                ij0Var.f20049OooO00o.o0000O0O((byte[]) this.f21963OooO0OO);
                ((ij0) this.f21964OooO0Oo).f20049OooO00o.Ooooo00(this.f21961OooO00o);
                ((ij0) this.f21964OooO0Oo).f20049OooO00o.OooO00o(this.f21962OooO0O0);
                ((ij0) this.f21964OooO0Oo).f20049OooO00o.o0000oo0();
                ((ij0) this.f21964OooO0Oo).f20049OooO00o.zzf();
            }
        } catch (RemoteException e) {
            Log.d("GASS", "Clearcut log failed", e);
        }
    }

    public synchronized void OooO0o() {
        this.f21961OooO00o = 0;
        this.f21962OooO0O0 = 0;
        Arrays.fill((Object[]) this.f21964OooO0Oo, (Object) null);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Cloneable, java.lang.Object, long[]] */
    public synchronized void OooO0o0(long j, Object obj) {
        try {
            if (this.f21962OooO0O0 > 0) {
                if (j <= ((long[]) this.f21963OooO0OO)[((this.f21961OooO00o + r0) - 1) % ((Object[]) this.f21964OooO0Oo).length]) {
                    OooO0o();
                }
            }
            int length = ((Object[]) this.f21964OooO0Oo).length;
            if (this.f21962OooO0O0 >= length) {
                int i = length + length;
                ?? r2 = new long[i];
                Object[] objArr = new Object[i];
                int i2 = this.f21961OooO00o;
                int i3 = length - i2;
                System.arraycopy((long[]) this.f21963OooO0OO, i2, r2, 0, i3);
                System.arraycopy((Object[]) this.f21964OooO0Oo, this.f21961OooO00o, objArr, 0, i3);
                int i4 = this.f21961OooO00o;
                if (i4 > 0) {
                    System.arraycopy((long[]) this.f21963OooO0OO, 0, r2, i3, i4);
                    System.arraycopy((Object[]) this.f21964OooO0Oo, 0, objArr, i3, this.f21961OooO00o);
                }
                this.f21963OooO0OO = r2;
                this.f21964OooO0Oo = objArr;
                this.f21961OooO00o = 0;
            }
            int i5 = this.f21961OooO00o;
            int i6 = this.f21962OooO0O0;
            Object[] objArr2 = (Object[]) this.f21964OooO0Oo;
            int length2 = (i5 + i6) % objArr2.length;
            ((long[]) this.f21963OooO0OO)[length2] = j;
            objArr2[length2] = obj;
            this.f21962OooO0O0 = i6 + 1;
        } catch (Throwable th) {
            throw th;
        }
    }

    public Object OooO0oO() {
        af0.OooooO0(this.f21962OooO0O0 > 0);
        Object[] objArr = (Object[]) this.f21964OooO0Oo;
        int i = this.f21961OooO00o;
        Object obj = objArr[i];
        objArr[i] = null;
        this.f21961OooO00o = (i + 1) % objArr.length;
        this.f21962OooO0O0--;
        return obj;
    }

    public o0O0OOO0(int i, ArrayList arrayList, int i2, Oo0000 oo0000) {
        this.f21961OooO00o = i;
        this.f21963OooO0OO = arrayList;
        this.f21962OooO0O0 = i2;
        this.f21964OooO0Oo = oo0000;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ o0O0OOO0(ij0 ij0Var, byte[] bArr) {
        this.f21964OooO0Oo = ij0Var;
        this.f21963OooO0OO = bArr;
    }
}

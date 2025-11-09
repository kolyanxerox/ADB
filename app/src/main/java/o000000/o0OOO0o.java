package o000000;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class o0OOO0o {

    /* renamed from: OooO00o, reason: collision with root package name */
    public float f29117OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public float f29118OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public float f29119OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public float f29120OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public float f29121OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public float f29122OooO0o0;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public final ArrayList f29123OooO0oO = new ArrayList();

    /* renamed from: OooO0oo, reason: collision with root package name */
    public final ArrayList f29124OooO0oo = new ArrayList();

    public o0OOO0o() {
        OooO0o0(0.0f, 0.0f, 270.0f, 0.0f);
    }

    public final void OooO00o(float f, float f2, float f3, float f4, float f5, float f6) {
        o00Ooo o00ooo2 = new o00Ooo(f, f2, f3, f4);
        o00ooo2.f29113OooO0o = f5;
        o00ooo2.f29115OooO0oO = f6;
        this.f29123OooO0oO.add(o00ooo2);
        o00O0O o00o0o = new o00O0O(o00ooo2);
        float f7 = f5 + f6;
        boolean z = f6 < 0.0f;
        if (z) {
            f5 = (f5 + 180.0f) % 360.0f;
        }
        float f8 = z ? (180.0f + f7) % 360.0f : f7;
        OooO0O0(f5);
        this.f29124OooO0oo.add(o00o0o);
        this.f29122OooO0o0 = f8;
        double d = f7;
        this.f29119OooO0OO = (((f3 - f) / 2.0f) * ((float) Math.cos(Math.toRadians(d)))) + ((f + f3) * 0.5f);
        this.f29120OooO0Oo = (((f4 - f2) / 2.0f) * ((float) Math.sin(Math.toRadians(d)))) + ((f2 + f4) * 0.5f);
    }

    public final void OooO0O0(float f) {
        float f2 = this.f29122OooO0o0;
        if (f2 == f) {
            return;
        }
        float f3 = ((f - f2) + 360.0f) % 360.0f;
        if (f3 > 180.0f) {
            return;
        }
        float f4 = this.f29119OooO0OO;
        float f5 = this.f29120OooO0Oo;
        o00Ooo o00ooo2 = new o00Ooo(f4, f5, f4, f5);
        o00ooo2.f29113OooO0o = this.f29122OooO0o0;
        o00ooo2.f29115OooO0oO = f3;
        this.f29124OooO0oo.add(new o00O0O(o00ooo2));
        this.f29122OooO0o0 = f;
    }

    public final void OooO0OO(Matrix matrix, Path path) {
        ArrayList arrayList = this.f29123OooO0oO;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((o00oO0o) arrayList.get(i)).OooO00o(matrix, path);
        }
    }

    public final void OooO0Oo(float f, float f2) {
        oo000o oo000oVar = new oo000o();
        oo000oVar.f29129OooO0O0 = f;
        oo000oVar.f29130OooO0OO = f2;
        this.f29123OooO0oO.add(oo000oVar);
        o00Oo0 o00oo0 = new o00Oo0(oo000oVar, this.f29119OooO0OO, this.f29120OooO0Oo);
        float fOooO0O0 = o00oo0.OooO0O0() + 270.0f;
        float fOooO0O02 = o00oo0.OooO0O0() + 270.0f;
        OooO0O0(fOooO0O0);
        this.f29124OooO0oo.add(o00oo0);
        this.f29122OooO0o0 = fOooO0O02;
        this.f29119OooO0OO = f;
        this.f29120OooO0Oo = f2;
    }

    public final void OooO0o0(float f, float f2, float f3, float f4) {
        this.f29117OooO00o = f;
        this.f29118OooO0O0 = f2;
        this.f29119OooO0OO = f;
        this.f29120OooO0Oo = f2;
        this.f29122OooO0o0 = f3;
        this.f29121OooO0o = (f3 + f4) % 360.0f;
        this.f29123OooO0oO.clear();
        this.f29124OooO0oo.clear();
    }
}

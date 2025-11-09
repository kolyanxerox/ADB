package com.ironsource;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.zw */
/* loaded from: classes2.dex */
public final class C3920zw {

    /* renamed from: a */
    private final boolean f13054a;

    /* renamed from: b */
    private final boolean f13055b;

    /* renamed from: c */
    private final boolean f13056c;

    public C3920zw(boolean z, boolean z2, boolean z3) {
        this.f13054a = z;
        this.f13055b = z2;
        this.f13056c = z3;
    }

    /* renamed from: a */
    public static /* synthetic */ C3920zw m13430a(C3920zw c3920zw, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = c3920zw.f13054a;
        }
        if ((i & 2) != 0) {
            z2 = c3920zw.f13055b;
        }
        if ((i & 4) != 0) {
            z3 = c3920zw.f13056c;
        }
        return c3920zw.m13431a(z, z2, z3);
    }

    /* renamed from: b */
    public final boolean m13433b() {
        return this.f13055b;
    }

    /* renamed from: c */
    public final boolean m13434c() {
        return this.f13056c;
    }

    /* renamed from: d */
    public final boolean m13435d() {
        return this.f13056c;
    }

    /* renamed from: e */
    public final boolean m13436e() {
        return this.f13054a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3920zw)) {
            return false;
        }
        C3920zw c3920zw = (C3920zw) obj;
        return this.f13054a == c3920zw.f13054a && this.f13055b == c3920zw.f13055b && this.f13056c == c3920zw.f13056c;
    }

    /* renamed from: f */
    public final boolean m13437f() {
        return this.f13055b;
    }

    /* renamed from: g */
    public final JSONObject m13438g() throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put(C3007ch.f7750k, this.f13054a).put(C3007ch.f7751l, this.f13055b).put(C3007ch.f7752m, this.f13056c);
        kotlin.jvm.internal.OooOo.OooO0Oo(jSONObjectPut, "JSONObject()\n        .pu…ts.IS_SHOWN_KEY, isShown)");
        return jSONObjectPut;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    public int hashCode() {
        boolean z = this.f13054a;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        ?? r2 = this.f13055b;
        int i2 = r2;
        if (r2 != 0) {
            i2 = 1;
        }
        int i3 = (i + i2) * 31;
        boolean z2 = this.f13056c;
        return i3 + (z2 ? 1 : z2 ? 1 : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ViewVisibilityParams(isVisible=");
        sb.append(this.f13054a);
        sb.append(", isWindowVisible=");
        sb.append(this.f13055b);
        sb.append(", isShown=");
        return androidx.datastore.preferences.protobuf.OooO00o.OooOOOO(sb, this.f13056c, ')');
    }

    /* renamed from: a */
    public final C3920zw m13431a(boolean z, boolean z2, boolean z3) {
        return new C3920zw(z, z2, z3);
    }

    /* renamed from: a */
    public final boolean m13432a() {
        return this.f13054a;
    }
}

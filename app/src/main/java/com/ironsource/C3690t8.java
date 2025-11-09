package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* renamed from: com.ironsource.t8 */
/* loaded from: classes2.dex */
public class C3690t8 {

    /* renamed from: a */
    private boolean f12038a = true;

    /* renamed from: b */
    private IronSourceError f12039b = null;

    /* renamed from: a */
    public IronSourceError m12401a() {
        return this.f12039b;
    }

    /* renamed from: b */
    public boolean m12403b() {
        return this.f12038a;
    }

    /* renamed from: c */
    public void m12404c() {
        this.f12038a = true;
        this.f12039b = null;
    }

    public String toString() {
        StringBuilder sb;
        if (m12403b()) {
            sb = new StringBuilder("valid:");
            sb.append(this.f12038a);
        } else {
            sb = new StringBuilder("valid:");
            sb.append(this.f12038a);
            sb.append(", IronSourceError:");
            sb.append(this.f12039b);
        }
        return sb.toString();
    }

    /* renamed from: a */
    public void m12402a(IronSourceError ironSourceError) {
        this.f12038a = false;
        this.f12039b = ironSourceError;
    }
}

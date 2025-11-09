package com.ironsource;

/* loaded from: classes2.dex */
public final /* synthetic */ class o00Oo0 implements Runnable {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ AbstractC3231iq f28551OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f28552OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C3306kw f28553OooOo0o;

    public /* synthetic */ o00Oo0(C3306kw c3306kw, AbstractC3231iq abstractC3231iq, int i) {
        this.f28552OooOo0O = i;
        this.f28553OooOo0o = c3306kw;
        this.f28551OooOo = abstractC3231iq;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f28552OooOo0O) {
            case 0:
                C3306kw.m9712b(this.f28553OooOo0o, this.f28551OooOo);
                break;
            default:
                C3306kw.m9706a(this.f28553OooOo0o, this.f28551OooOo);
                break;
        }
    }
}

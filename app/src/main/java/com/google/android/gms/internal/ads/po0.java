package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class po0 extends Throwable {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f23395OooOo0O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ po0(String str, int i) {
        super(str);
        this.f23395OooOo0O = i;
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        switch (this.f23395OooOo0O) {
            case 0:
                synchronized (this) {
                    break;
                }
            case 1:
                synchronized (this) {
                    break;
                }
            case 2:
                synchronized (this) {
                    break;
                }
            default:
                synchronized (this) {
                    break;
                }
        }
        return this;
    }
}

package o00OOO0O;

import java.util.Locale;

/* loaded from: classes3.dex */
public abstract class OooO00o implements Runnable {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final String f32331OooOo0O;

    public OooO00o(String str, Object... objArr) {
        byte[] bArr = OooO0OO.f32335OooO00o;
        this.f32331OooOo0O = String.format(Locale.US, str, objArr);
    }

    public abstract void OooO00o();

    @Override // java.lang.Runnable
    public final void run() {
        String name = Thread.currentThread().getName();
        Thread.currentThread().setName(this.f32331OooOo0O);
        try {
            OooO00o();
        } finally {
            Thread.currentThread().setName(name);
        }
    }
}

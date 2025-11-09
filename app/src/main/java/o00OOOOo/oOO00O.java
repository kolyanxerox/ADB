package o00OOooO;

import java.io.IOException;
import java.io.Serializable;

/* loaded from: classes3.dex */
public final class oOO00O extends IOException {

    /* renamed from: OooOo0o, reason: collision with root package name */
    public static final /* synthetic */ int f32645OooOo0o = 0;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final Serializable f32646OooOo0O;

    public oOO00O(IOException iOException, Serializable serializable) {
        super(iOException.getMessage(), iOException);
        this.f32646OooOo0O = serializable;
    }

    @Override // java.lang.Throwable
    /* renamed from: OooO00o, reason: merged with bridge method [inline-methods] */
    public final synchronized IOException getCause() {
        return (IOException) super.getCause();
    }
}

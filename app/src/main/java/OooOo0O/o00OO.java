package oOooo0o;

import com.google.android.gms.internal.measurement.o0OO0O0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;

/* loaded from: classes3.dex */
public final class o00OO extends o0OO0O0 {

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final Object f33155OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final Method f33156OooO0Oo;

    public o00OO(Method method, Object obj) {
        this.f33155OooO0OO = obj;
        this.f33156OooO0Oo = method;
    }

    @Override // com.google.android.gms.internal.measurement.o0OO0O0
    public final List OooO(List list, String str) throws SSLPeerUnverifiedException {
        try {
            return (List) this.f33156OooO0Oo.invoke(this.f33155OooO0OO, (X509Certificate[]) list.toArray(new X509Certificate[list.size()]), "RSA", str);
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        } catch (InvocationTargetException e2) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e2.getMessage());
            sSLPeerUnverifiedException.initCause(e2);
            throw sSLPeerUnverifiedException;
        }
    }

    public final boolean equals(Object obj) {
        return obj instanceof o00OO;
    }

    public final int hashCode() {
        return 0;
    }
}

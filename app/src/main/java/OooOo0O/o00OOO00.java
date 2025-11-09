package oOooo0o;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;
import o00OOO0O.OooO0OO;
import o00OOOo.OooOo00;

/* loaded from: classes3.dex */
public final class o00OOO00 implements OooOo00 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final X509TrustManager f33163OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final Method f33164OooO0O0;

    public o00OOO00(X509TrustManager x509TrustManager, Method method) {
        this.f33164OooO0O0 = method;
        this.f33163OooO00o = x509TrustManager;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o00OOO00)) {
            return false;
        }
        o00OOO00 o00ooo00 = (o00OOO00) obj;
        return this.f33163OooO00o.equals(o00ooo00.f33163OooO00o) && this.f33164OooO0O0.equals(o00ooo00.f33164OooO0O0);
    }

    @Override // o00OOOo.OooOo00
    public final X509Certificate findByIssuerAndSignature(X509Certificate x509Certificate) {
        try {
            TrustAnchor trustAnchor = (TrustAnchor) this.f33164OooO0O0.invoke(this.f33163OooO00o, x509Certificate);
            if (trustAnchor != null) {
                return trustAnchor.getTrustedCert();
            }
        } catch (IllegalAccessException e) {
            throw OooO0OO.OooO00o(e, "unable to get issues and signature");
        } catch (InvocationTargetException unused) {
        }
        return null;
    }

    public final int hashCode() {
        return (this.f33164OooO0O0.hashCode() * 31) + this.f33163OooO00o.hashCode();
    }
}

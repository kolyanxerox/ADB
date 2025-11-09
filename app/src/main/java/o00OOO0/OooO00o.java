package o00OOO0;

import androidx.webkit.ProxyConfig;
import com.google.android.gms.internal.ads.C2229xd;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import org.apache.tika.metadata.TikaCoreProperties;

/* loaded from: classes3.dex */
public final class OooO00o {

    /* renamed from: OooO, reason: collision with root package name */
    public final HostnameVerifier f32123OooO;

    /* renamed from: OooO00o, reason: collision with root package name */
    public final o0OoOo0 f32124OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final OooO0O0 f32125OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final SocketFactory f32126OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final OooO0O0 f32127OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public final List f32128OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final List f32129OooO0o0;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public final ProxySelector f32130OooO0oO;

    /* renamed from: OooO0oo, reason: collision with root package name */
    public final SSLSocketFactory f32131OooO0oo;

    /* renamed from: OooOO0, reason: collision with root package name */
    public final OooOO0O f32132OooOO0;

    public OooO00o(String str, int i, OooO0O0 oooO0O0, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, OooOO0O oooOO0O, OooO0O0 oooO0O02, List list, List list2, ProxySelector proxySelector) {
        C2229xd c2229xd = new C2229xd();
        String str2 = sSLSocketFactory != null ? "https" : ProxyConfig.MATCH_HTTP;
        if (str2.equalsIgnoreCase(ProxyConfig.MATCH_HTTP)) {
            c2229xd.f25605OooO0O0 = ProxyConfig.MATCH_HTTP;
        } else {
            if (!str2.equalsIgnoreCase("https")) {
                throw new IllegalArgumentException("unexpected scheme: ".concat(str2));
            }
            c2229xd.f25605OooO0O0 = "https";
        }
        if (str == null) {
            throw new NullPointerException("host == null");
        }
        String strOooO0OO = o00OOO0O.OooO0OO.OooO0OO(o0OoOo0.OooO0oO(str, 0, str.length(), false));
        if (strOooO0OO == null) {
            throw new IllegalArgumentException("unexpected host: ".concat(str));
        }
        c2229xd.f25608OooO0o = strOooO0OO;
        if (i <= 0 || i > 65535) {
            throw new IllegalArgumentException(OooO0oO.OooOo.OooO0o(i, "unexpected port: "));
        }
        c2229xd.f25606OooO0OO = i;
        this.f32124OooO00o = c2229xd.OooO00o();
        if (oooO0O0 == null) {
            throw new NullPointerException("dns == null");
        }
        this.f32125OooO0O0 = oooO0O0;
        if (socketFactory == null) {
            throw new NullPointerException("socketFactory == null");
        }
        this.f32126OooO0OO = socketFactory;
        if (oooO0O02 == null) {
            throw new NullPointerException("proxyAuthenticator == null");
        }
        this.f32127OooO0Oo = oooO0O02;
        if (list == null) {
            throw new NullPointerException("protocols == null");
        }
        this.f32129OooO0o0 = Collections.unmodifiableList(new ArrayList(list));
        if (list2 == null) {
            throw new NullPointerException("connectionSpecs == null");
        }
        this.f32128OooO0o = Collections.unmodifiableList(new ArrayList(list2));
        if (proxySelector == null) {
            throw new NullPointerException("proxySelector == null");
        }
        this.f32130OooO0oO = proxySelector;
        this.f32131OooO0oo = sSLSocketFactory;
        this.f32123OooO = hostnameVerifier;
        this.f32132OooOO0 = oooOO0O;
    }

    public final boolean OooO00o(OooO00o oooO00o) {
        return this.f32125OooO0O0.equals(oooO00o.f32125OooO0O0) && this.f32127OooO0Oo.equals(oooO00o.f32127OooO0Oo) && this.f32129OooO0o0.equals(oooO00o.f32129OooO0o0) && this.f32128OooO0o.equals(oooO00o.f32128OooO0o) && this.f32130OooO0oO.equals(oooO00o.f32130OooO0oO) && o00OOO0O.OooO0OO.OooOO0O(null, null) && o00OOO0O.OooO0OO.OooOO0O(this.f32131OooO0oo, oooO00o.f32131OooO0oo) && o00OOO0O.OooO0OO.OooOO0O(this.f32123OooO, oooO00o.f32123OooO) && o00OOO0O.OooO0OO.OooOO0O(this.f32132OooOO0, oooO00o.f32132OooOO0) && this.f32124OooO00o.f32298OooO0o0 == oooO00o.f32124OooO00o.f32298OooO0o0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof OooO00o)) {
            return false;
        }
        OooO00o oooO00o = (OooO00o) obj;
        return this.f32124OooO00o.equals(oooO00o.f32124OooO00o) && OooO00o(oooO00o);
    }

    public final int hashCode() {
        int iHashCode = (this.f32130OooO0oO.hashCode() + ((this.f32128OooO0o.hashCode() + ((this.f32129OooO0o0.hashCode() + ((this.f32127OooO0Oo.hashCode() + ((this.f32125OooO0O0.hashCode() + androidx.datastore.preferences.protobuf.OooO00o.OooO0O0(IronSourceError.ERROR_NON_EXISTENT_INSTANCE, 31, this.f32124OooO00o.f32292OooO)) * 31)) * 31)) * 31)) * 31)) * 961;
        SSLSocketFactory sSLSocketFactory = this.f32131OooO0oo;
        int iHashCode2 = (iHashCode + (sSLSocketFactory != null ? sSLSocketFactory.hashCode() : 0)) * 31;
        HostnameVerifier hostnameVerifier = this.f32123OooO;
        int iHashCode3 = (iHashCode2 + (hostnameVerifier != null ? hostnameVerifier.hashCode() : 0)) * 31;
        OooOO0O oooOO0O = this.f32132OooOO0;
        return iHashCode3 + (oooOO0O != null ? oooOO0O.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Address{");
        o0OoOo0 o0oooo0 = this.f32124OooO00o;
        sb.append(o0oooo0.f32296OooO0Oo);
        sb.append(TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER);
        sb.append(o0oooo0.f32298OooO0o0);
        sb.append(", proxySelector=");
        sb.append(this.f32130OooO0oO);
        sb.append("}");
        return sb.toString();
    }
}

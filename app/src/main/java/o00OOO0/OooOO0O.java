package o00OOO0;

import com.applovin.shadow.okio.Utf8;
import com.google.android.gms.internal.measurement.o0OO0O0;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import o00OOOoO.o0000O0;
import org.apache.tika.fork.ForkServer;
import org.apache.tika.metadata.TikaCoreProperties;

/* loaded from: classes3.dex */
public final class OooOO0O {

    /* renamed from: OooO0OO */
    public static final OooOO0O f32153OooO0OO = new OooOO0O(new LinkedHashSet(new ArrayList()), null);

    /* renamed from: OooO00o */
    public final LinkedHashSet f32154OooO00o;

    /* renamed from: OooO0O0 */
    public final o0OO0O0 f32155OooO0O0;

    public OooOO0O(LinkedHashSet linkedHashSet, o0OO0O0 o0oo0o0) {
        this.f32154OooO00o = linkedHashSet;
        this.f32155OooO0O0 = o0oo0o0;
    }

    public static String OooO0O0(X509Certificate x509Certificate) throws NoSuchAlgorithmException {
        if (x509Certificate == null) {
            throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
        }
        StringBuilder sb = new StringBuilder("sha256/");
        o0000O0 o0000o0OooO0OO = o0000O0.OooOOO0(x509Certificate.getPublicKey().getEncoded()).OooO0OO("SHA-256");
        byte[] map = o00OOOoO.o000000O.f32539OooO00o;
        byte[] bArr = o0000o0OooO0OO.f32555OooOo0O;
        kotlin.jvm.internal.OooOo.OooO0o0(bArr, "<this>");
        kotlin.jvm.internal.OooOo.OooO0o0(map, "map");
        byte[] bArr2 = new byte[((bArr.length + 2) / 3) * 4];
        int length = bArr.length - (bArr.length % 3);
        int i = 0;
        int i2 = 0;
        while (i < length) {
            byte b = bArr[i];
            int i3 = i + 2;
            byte b2 = bArr[i + 1];
            i += 3;
            byte b3 = bArr[i3];
            bArr2[i2] = map[(b & ForkServer.ERROR) >> 2];
            bArr2[i2 + 1] = map[((b & 3) << 4) | ((b2 & ForkServer.ERROR) >> 4)];
            int i4 = i2 + 3;
            bArr2[i2 + 2] = map[((b2 & 15) << 2) | ((b3 & ForkServer.ERROR) >> 6)];
            i2 += 4;
            bArr2[i4] = map[b3 & Utf8.REPLACEMENT_BYTE];
        }
        int length2 = bArr.length - length;
        if (length2 == 1) {
            byte b4 = bArr[i];
            bArr2[i2] = map[(b4 & ForkServer.ERROR) >> 2];
            bArr2[i2 + 1] = map[(b4 & 3) << 4];
            bArr2[i2 + 2] = 61;
            bArr2[i2 + 3] = 61;
        } else if (length2 == 2) {
            int i5 = i + 1;
            byte b5 = bArr[i];
            byte b6 = bArr[i5];
            bArr2[i2] = map[(b5 & ForkServer.ERROR) >> 2];
            bArr2[i2 + 1] = map[((b5 & 3) << 4) | ((b6 & ForkServer.ERROR) >> 4)];
            bArr2[i2 + 2] = map[(b6 & 15) << 2];
            bArr2[i2 + 3] = 61;
        }
        sb.append(new String(bArr2, o00O0oO.o0OO00O.f31451OooO00o));
        return sb.toString();
    }

    public final void OooO00o(String str, List list) throws SSLPeerUnverifiedException {
        List list2 = Collections.EMPTY_LIST;
        Iterator it = this.f32154OooO00o.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        if (list2.isEmpty()) {
            return;
        }
        o0OO0O0 o0oo0o0 = this.f32155OooO0O0;
        if (o0oo0o0 != null) {
            list = o0oo0o0.OooO(list, str);
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (list2.size() > 0) {
                list2.get(0).getClass();
                throw new ClassCastException();
            }
        }
        StringBuilder sb = new StringBuilder("Certificate pinning failure!\n  Peer certificate chain:");
        int size2 = list.size();
        for (int i2 = 0; i2 < size2; i2++) {
            X509Certificate x509Certificate = (X509Certificate) list.get(i2);
            sb.append("\n    ");
            sb.append(OooO0O0(x509Certificate));
            sb.append(": ");
            sb.append(x509Certificate.getSubjectDN().getName());
        }
        sb.append("\n  Pinned certificates for ");
        sb.append(str);
        sb.append(TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER);
        int size3 = list2.size();
        for (int i3 = 0; i3 < size3; i3++) {
            if (list2.get(i3) != null) {
                throw new ClassCastException();
            }
            sb.append("\n    null");
        }
        throw new SSLPeerUnverifiedException(sb.toString());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OooOO0O)) {
            return false;
        }
        OooOO0O oooOO0O = (OooOO0O) obj;
        return o00OOO0O.OooO0OO.OooOO0O(this.f32155OooO0O0, oooOO0O.f32155OooO0O0) && this.f32154OooO00o.equals(oooOO0O.f32154OooO00o);
    }

    public final int hashCode() {
        o0OO0O0 o0oo0o0 = this.f32155OooO0O0;
        return this.f32154OooO00o.hashCode() + ((o0oo0o0 != null ? o0oo0o0.hashCode() : 0) * 31);
    }
}

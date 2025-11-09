package com.applovin.shadow.okhttp3;

import androidx.datastore.preferences.protobuf.OooO00o;
import androidx.webkit.ProxyConfig;
import com.applovin.shadow.okhttp3.internal.HostnamesKt;
import com.applovin.shadow.okhttp3.internal.tls.CertificateChainCleaner;
import com.applovin.shadow.okio.ByteString;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.jvm.internal.OooOO0O;
import kotlin.jvm.internal.OooOo;
import kotlin.jvm.internal.Oooo000;
import kotlin.jvm.internal.o0O0O00;
import o00O0.OooOOO;
import o00O0.OooOo00;
import o00O0.oo000o;
import o00O0Oo.OooO0O0;
import o00O0oO.o000000;
import o00O0oO.o0000O00;
import org.apache.tika.metadata.TikaCoreProperties;

/* loaded from: classes.dex */
public final class CertificatePinner {
    public static final Companion Companion = new Companion(null);
    public static final CertificatePinner DEFAULT = new Builder().build();
    private final CertificateChainCleaner certificateChainCleaner;
    private final Set<Pin> pins;

    public static final class Builder {
        private final List<Pin> pins = new ArrayList();

        public final Builder add(String pattern, String... pins) {
            OooOo.OooO0o0(pattern, "pattern");
            OooOo.OooO0o0(pins, "pins");
            for (String str : pins) {
                this.pins.add(new Pin(pattern, str));
            }
            return this;
        }

        public final CertificatePinner build() {
            return new CertificatePinner(OooOo00.Oooo0oo(this.pins), null, 2, 0 == true ? 1 : 0);
        }

        public final List<Pin> getPins() {
            return this.pins;
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(OooOO0O oooOO0O) {
            this();
        }

        public final String pin(Certificate certificate) {
            OooOo.OooO0o0(certificate, "certificate");
            if (!(certificate instanceof X509Certificate)) {
                throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
            }
            return "sha256/" + sha256Hash((X509Certificate) certificate).base64();
        }

        public final ByteString sha1Hash(X509Certificate x509Certificate) {
            OooOo.OooO0o0(x509Certificate, "<this>");
            ByteString.Companion companion = ByteString.Companion;
            byte[] encoded = x509Certificate.getPublicKey().getEncoded();
            OooOo.OooO0Oo(encoded, "publicKey.encoded");
            return ByteString.Companion.of$default(companion, encoded, 0, 0, 3, null).sha1();
        }

        public final ByteString sha256Hash(X509Certificate x509Certificate) {
            OooOo.OooO0o0(x509Certificate, "<this>");
            ByteString.Companion companion = ByteString.Companion;
            byte[] encoded = x509Certificate.getPublicKey().getEncoded();
            OooOo.OooO0Oo(encoded, "publicKey.encoded");
            return ByteString.Companion.of$default(companion, encoded, 0, 0, 3, null).sha256();
        }

        private Companion() {
        }
    }

    public static final class Pin {
        private final ByteString hash;
        private final String hashAlgorithm;
        private final String pattern;

        public Pin(String pattern, String pin) {
            OooOo.OooO0o0(pattern, "pattern");
            OooOo.OooO0o0(pin, "pin");
            if ((!o0000O00.Oooo0OO(pattern, "*.", false) || o000000.OoooO0O(pattern, ProxyConfig.MATCH_ALL_SCHEMES, 1, 4) != -1) && ((!o0000O00.Oooo0OO(pattern, "**.", false) || o000000.OoooO0O(pattern, ProxyConfig.MATCH_ALL_SCHEMES, 2, 4) != -1) && o000000.OoooO0O(pattern, ProxyConfig.MATCH_ALL_SCHEMES, 0, 6) != -1)) {
                throw new IllegalArgumentException("Unexpected pattern: ".concat(pattern).toString());
            }
            String canonicalHost = HostnamesKt.toCanonicalHost(pattern);
            if (canonicalHost == null) {
                throw new IllegalArgumentException("Invalid pattern: ".concat(pattern));
            }
            this.pattern = canonicalHost;
            if (o0000O00.Oooo0OO(pin, "sha1/", false)) {
                this.hashAlgorithm = "sha1";
                ByteString.Companion companion = ByteString.Companion;
                String strSubstring = pin.substring(5);
                OooOo.OooO0Oo(strSubstring, "this as java.lang.String).substring(startIndex)");
                ByteString byteStringDecodeBase64 = companion.decodeBase64(strSubstring);
                if (byteStringDecodeBase64 == null) {
                    throw new IllegalArgumentException("Invalid pin hash: ".concat(pin));
                }
                this.hash = byteStringDecodeBase64;
                return;
            }
            if (!o0000O00.Oooo0OO(pin, "sha256/", false)) {
                throw new IllegalArgumentException("pins must start with 'sha256/' or 'sha1/': ".concat(pin));
            }
            this.hashAlgorithm = "sha256";
            ByteString.Companion companion2 = ByteString.Companion;
            String strSubstring2 = pin.substring(7);
            OooOo.OooO0Oo(strSubstring2, "this as java.lang.String).substring(startIndex)");
            ByteString byteStringDecodeBase642 = companion2.decodeBase64(strSubstring2);
            if (byteStringDecodeBase642 == null) {
                throw new IllegalArgumentException("Invalid pin hash: ".concat(pin));
            }
            this.hash = byteStringDecodeBase642;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Pin)) {
                return false;
            }
            Pin pin = (Pin) obj;
            return OooOo.OooO00o(this.pattern, pin.pattern) && OooOo.OooO00o(this.hashAlgorithm, pin.hashAlgorithm) && OooOo.OooO00o(this.hash, pin.hash);
        }

        public final ByteString getHash() {
            return this.hash;
        }

        public final String getHashAlgorithm() {
            return this.hashAlgorithm;
        }

        public final String getPattern() {
            return this.pattern;
        }

        public int hashCode() {
            return this.hash.hashCode() + OooO00o.OooO0O0(this.pattern.hashCode() * 31, 31, this.hashAlgorithm);
        }

        public final boolean matchesCertificate(X509Certificate certificate) {
            OooOo.OooO0o0(certificate, "certificate");
            String str = this.hashAlgorithm;
            if (OooOo.OooO00o(str, "sha256")) {
                return OooOo.OooO00o(this.hash, CertificatePinner.Companion.sha256Hash(certificate));
            }
            if (OooOo.OooO00o(str, "sha1")) {
                return OooOo.OooO00o(this.hash, CertificatePinner.Companion.sha1Hash(certificate));
            }
            return false;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x006c A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:17:0x006d A[RETURN] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean matchesHostname(java.lang.String r11) {
            /*
                r10 = this;
                java.lang.String r0 = "hostname"
                kotlin.jvm.internal.OooOo.OooO0o0(r11, r0)
                java.lang.String r0 = r10.pattern
                java.lang.String r1 = "**."
                r2 = 0
                boolean r0 = o00O0oO.o0000O00.Oooo0OO(r0, r1, r2)
                r1 = 46
                r3 = 1
                if (r0 == 0) goto L3b
                java.lang.String r0 = r10.pattern
                int r0 = r0.length()
                int r9 = r0 + (-3)
                int r0 = r11.length()
                int r0 = r0 - r9
                int r4 = r11.length()
                int r5 = r4 - r9
                java.lang.String r7 = r10.pattern
                r6 = 0
                r8 = 3
                r4 = r11
                boolean r11 = o00O0oO.o0000O00.Oooo00O(r4, r5, r6, r7, r8, r9)
                if (r11 == 0) goto L6d
                if (r0 == 0) goto L6c
                int r0 = r0 - r3
                char r11 = r4.charAt(r0)
                if (r11 != r1) goto L6d
                goto L6c
            L3b:
                r4 = r11
                java.lang.String r11 = r10.pattern
                java.lang.String r0 = "*."
                boolean r11 = o00O0oO.o0000O00.Oooo0OO(r11, r0, r2)
                if (r11 == 0) goto L6e
                java.lang.String r11 = r10.pattern
                int r11 = r11.length()
                int r9 = r11 + (-1)
                int r11 = r4.length()
                int r11 = r11 - r9
                int r0 = r4.length()
                int r5 = r0 - r9
                java.lang.String r7 = r10.pattern
                r6 = 0
                r8 = 1
                boolean r0 = o00O0oO.o0000O00.Oooo00O(r4, r5, r6, r7, r8, r9)
                if (r0 == 0) goto L6d
                int r11 = r11 - r3
                r0 = 4
                int r11 = o00O0oO.o000000.o000oOoO(r4, r1, r11, r0)
                r0 = -1
                if (r11 != r0) goto L6d
            L6c:
                return r3
            L6d:
                return r2
            L6e:
                java.lang.String r11 = r10.pattern
                boolean r11 = r4.equals(r11)
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: com.applovin.shadow.okhttp3.CertificatePinner.Pin.matchesHostname(java.lang.String):boolean");
        }

        public String toString() {
            return this.hashAlgorithm + '/' + this.hash.base64();
        }
    }

    /* renamed from: com.applovin.shadow.okhttp3.CertificatePinner$check$1 */
    public static final class C13371 extends Oooo000 implements OooO0O0 {
        final /* synthetic */ String $hostname;
        final /* synthetic */ List<Certificate> $peerCertificates;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C13371(List<? extends Certificate> list, String str) {
            super(0);
            this.$peerCertificates = list;
            this.$hostname = str;
        }

        @Override // o00O0Oo.OooO0O0
        public final List<X509Certificate> invoke() {
            List<Certificate> listClean;
            CertificateChainCleaner certificateChainCleaner$okhttp = CertificatePinner.this.getCertificateChainCleaner$okhttp();
            if (certificateChainCleaner$okhttp == null || (listClean = certificateChainCleaner$okhttp.clean(this.$peerCertificates, this.$hostname)) == null) {
                listClean = this.$peerCertificates;
            }
            ArrayList arrayList = new ArrayList(o00O0.Oooo000.OooOo0(listClean, 10));
            for (Certificate certificate : listClean) {
                OooOo.OooO0OO(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                arrayList.add((X509Certificate) certificate);
            }
            return arrayList;
        }
    }

    public CertificatePinner(Set<Pin> pins, CertificateChainCleaner certificateChainCleaner) {
        OooOo.OooO0o0(pins, "pins");
        this.pins = pins;
        this.certificateChainCleaner = certificateChainCleaner;
    }

    public static final String pin(Certificate certificate) {
        return Companion.pin(certificate);
    }

    public static final ByteString sha1Hash(X509Certificate x509Certificate) {
        return Companion.sha1Hash(x509Certificate);
    }

    public static final ByteString sha256Hash(X509Certificate x509Certificate) {
        return Companion.sha256Hash(x509Certificate);
    }

    public final void check(String hostname, List<? extends Certificate> peerCertificates) throws SSLPeerUnverifiedException {
        OooOo.OooO0o0(hostname, "hostname");
        OooOo.OooO0o0(peerCertificates, "peerCertificates");
        check$okhttp(hostname, new C13371(peerCertificates, hostname));
    }

    public final void check$okhttp(String hostname, OooO0O0 cleanedPeerCertificatesFn) throws SSLPeerUnverifiedException {
        OooOo.OooO0o0(hostname, "hostname");
        OooOo.OooO0o0(cleanedPeerCertificatesFn, "cleanedPeerCertificatesFn");
        List<Pin> listFindMatchingPins = findMatchingPins(hostname);
        if (listFindMatchingPins.isEmpty()) {
            return;
        }
        List<X509Certificate> list = (List) cleanedPeerCertificatesFn.invoke();
        for (X509Certificate x509Certificate : list) {
            ByteString byteStringSha256Hash = null;
            ByteString byteStringSha1Hash = null;
            for (Pin pin : listFindMatchingPins) {
                String hashAlgorithm = pin.getHashAlgorithm();
                if (OooOo.OooO00o(hashAlgorithm, "sha256")) {
                    if (byteStringSha256Hash == null) {
                        byteStringSha256Hash = Companion.sha256Hash(x509Certificate);
                    }
                    if (OooOo.OooO00o(pin.getHash(), byteStringSha256Hash)) {
                        return;
                    }
                } else {
                    if (!OooOo.OooO00o(hashAlgorithm, "sha1")) {
                        throw new AssertionError("unsupported hashAlgorithm: " + pin.getHashAlgorithm());
                    }
                    if (byteStringSha1Hash == null) {
                        byteStringSha1Hash = Companion.sha1Hash(x509Certificate);
                    }
                    if (OooOo.OooO00o(pin.getHash(), byteStringSha1Hash)) {
                        return;
                    }
                }
            }
        }
        StringBuilder sb = new StringBuilder("Certificate pinning failure!\n  Peer certificate chain:");
        for (X509Certificate x509Certificate2 : list) {
            sb.append("\n    ");
            sb.append(Companion.pin(x509Certificate2));
            sb.append(": ");
            sb.append(x509Certificate2.getSubjectDN().getName());
        }
        sb.append("\n  Pinned certificates for ");
        sb.append(hostname);
        sb.append(TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER);
        for (Pin pin2 : listFindMatchingPins) {
            sb.append("\n    ");
            sb.append(pin2);
        }
        String string = sb.toString();
        OooOo.OooO0Oo(string, "StringBuilder().apply(builderAction).toString()");
        throw new SSLPeerUnverifiedException(string);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof CertificatePinner)) {
            return false;
        }
        CertificatePinner certificatePinner = (CertificatePinner) obj;
        return OooOo.OooO00o(certificatePinner.pins, this.pins) && OooOo.OooO00o(certificatePinner.certificateChainCleaner, this.certificateChainCleaner);
    }

    public final List<Pin> findMatchingPins(String hostname) {
        OooOo.OooO0o0(hostname, "hostname");
        Set<Pin> set = this.pins;
        List arrayList = oo000o.f31251OooOo0O;
        for (Object obj : set) {
            if (((Pin) obj).matchesHostname(hostname)) {
                if (arrayList.isEmpty()) {
                    arrayList = new ArrayList();
                }
                o0O0O00.OooO00o(arrayList).add(obj);
            }
        }
        return arrayList;
    }

    public final CertificateChainCleaner getCertificateChainCleaner$okhttp() {
        return this.certificateChainCleaner;
    }

    public final Set<Pin> getPins() {
        return this.pins;
    }

    public int hashCode() {
        int iHashCode = (this.pins.hashCode() + 1517) * 41;
        CertificateChainCleaner certificateChainCleaner = this.certificateChainCleaner;
        return iHashCode + (certificateChainCleaner != null ? certificateChainCleaner.hashCode() : 0);
    }

    public final CertificatePinner withCertificateChainCleaner$okhttp(CertificateChainCleaner certificateChainCleaner) {
        OooOo.OooO0o0(certificateChainCleaner, "certificateChainCleaner");
        return OooOo.OooO00o(this.certificateChainCleaner, certificateChainCleaner) ? this : new CertificatePinner(this.pins, certificateChainCleaner);
    }

    public final void check(String hostname, Certificate... peerCertificates) throws SSLPeerUnverifiedException {
        OooOo.OooO0o0(hostname, "hostname");
        OooOo.OooO0o0(peerCertificates, "peerCertificates");
        check(hostname, OooOOO.OoooOOo(peerCertificates));
    }

    public /* synthetic */ CertificatePinner(Set set, CertificateChainCleaner certificateChainCleaner, int i, OooOO0O oooOO0O) {
        this(set, (i & 2) != 0 ? null : certificateChainCleaner);
    }
}

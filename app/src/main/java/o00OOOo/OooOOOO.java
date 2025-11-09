package o00OOOo;

import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;

/* loaded from: classes3.dex */
public final class OooOOOO implements HostnameVerifier {

    /* renamed from: OooO00o, reason: collision with root package name */
    public static final OooOOOO f32532OooO00o = new OooOOOO();

    public static ArrayList OooO00o(X509Certificate x509Certificate) throws CertificateParsingException {
        List listOooO0O0 = OooO0O0(x509Certificate, 7);
        List listOooO0O02 = OooO0O0(x509Certificate, 2);
        ArrayList arrayList = new ArrayList(listOooO0O02.size() + listOooO0O0.size());
        arrayList.addAll(listOooO0O0);
        arrayList.addAll(listOooO0O02);
        return arrayList;
    }

    public static List OooO0O0(X509Certificate x509Certificate, int i) throws CertificateParsingException {
        Integer num;
        String str;
        ArrayList arrayList = new ArrayList();
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return Collections.EMPTY_LIST;
            }
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && (num = (Integer) list.get(0)) != null && num.intValue() == i && (str = (String) list.get(1)) != null) {
                    arrayList.add(str);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return Collections.EMPTY_LIST;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00e6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[LOOP:1: B:11:0x003a->B:70:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean OooO0OO(java.lang.String r8, java.security.cert.X509Certificate r9) throws java.security.cert.CertificateParsingException {
        /*
            java.util.regex.Pattern r0 = o00OOO0O.OooO0OO.f32349OooOOo0
            java.util.regex.Matcher r0 = r0.matcher(r8)
            boolean r0 = r0.matches()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L2b
            r0 = 7
            java.util.List r9 = OooO0O0(r9, r0)
            int r0 = r9.size()
            r3 = r2
        L18:
            if (r3 >= r0) goto Le7
            java.lang.Object r4 = r9.get(r3)
            java.lang.String r4 = (java.lang.String) r4
            boolean r4 = r8.equalsIgnoreCase(r4)
            if (r4 == 0) goto L28
            goto Le6
        L28:
            int r3 = r3 + 1
            goto L18
        L2b:
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r8 = r8.toLowerCase(r0)
            r0 = 2
            java.util.List r9 = OooO0O0(r9, r0)
            java.util.Iterator r9 = r9.iterator()
        L3a:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto Le7
            java.lang.Object r0 = r9.next()
            java.lang.String r0 = (java.lang.String) r0
            if (r8 == 0) goto Lb9
            int r3 = r8.length()
            if (r3 == 0) goto Lb9
            java.lang.String r3 = "."
            boolean r4 = r8.startsWith(r3)
            if (r4 != 0) goto Lb9
            java.lang.String r4 = ".."
            boolean r5 = r8.endsWith(r4)
            if (r5 == 0) goto L5f
            goto Lb9
        L5f:
            if (r0 == 0) goto Lb9
            int r5 = r0.length()
            if (r5 == 0) goto Lb9
            boolean r5 = r0.startsWith(r3)
            if (r5 != 0) goto Lb9
            boolean r4 = r0.endsWith(r4)
            if (r4 == 0) goto L74
            goto Lb9
        L74:
            boolean r4 = r8.endsWith(r3)
            if (r4 != 0) goto L7f
            java.lang.String r4 = r8.concat(r3)
            goto L80
        L7f:
            r4 = r8
        L80:
            boolean r5 = r0.endsWith(r3)
            if (r5 != 0) goto L8a
            java.lang.String r0 = r0.concat(r3)
        L8a:
            java.util.Locale r3 = java.util.Locale.US
            java.lang.String r0 = r0.toLowerCase(r3)
            java.lang.String r3 = "*"
            boolean r3 = r0.contains(r3)
            if (r3 != 0) goto L9d
            boolean r0 = r4.equals(r0)
            goto Le4
        L9d:
            java.lang.String r3 = "*."
            boolean r5 = r0.startsWith(r3)
            if (r5 == 0) goto Lb9
            r5 = 42
            int r5 = r0.indexOf(r5, r1)
            r6 = -1
            if (r5 == r6) goto Laf
            goto Lb9
        Laf:
            int r5 = r4.length()
            int r7 = r0.length()
            if (r5 >= r7) goto Lbb
        Lb9:
            r0 = r2
            goto Le4
        Lbb:
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto Lc2
            goto Lb9
        Lc2:
            java.lang.String r0 = r0.substring(r1)
            boolean r3 = r4.endsWith(r0)
            if (r3 != 0) goto Lcd
            goto Lb9
        Lcd:
            int r3 = r4.length()
            int r0 = r0.length()
            int r3 = r3 - r0
            if (r3 <= 0) goto Le3
            int r3 = r3 + (-1)
            r0 = 46
            int r0 = r4.lastIndexOf(r0, r3)
            if (r0 == r6) goto Le3
            goto Lb9
        Le3:
            r0 = r1
        Le4:
            if (r0 == 0) goto L3a
        Le6:
            return r1
        Le7:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o00OOOo.OooOOOO.OooO0OO(java.lang.String, java.security.cert.X509Certificate):boolean");
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String str, SSLSession sSLSession) {
        try {
            return OooO0OO(str, (X509Certificate) sSLSession.getPeerCertificates()[0]);
        } catch (SSLException unused) {
            return false;
        }
    }
}

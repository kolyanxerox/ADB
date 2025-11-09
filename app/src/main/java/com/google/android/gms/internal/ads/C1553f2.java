package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.google.android.gms.ads.internal.client.zzbe;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import java.io.ByteArrayInputStream;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.gms.internal.ads.f2 */
/* loaded from: classes2.dex */
public final class C1553f2 extends AbstractCallableC1959q2 {

    /* renamed from: Oooo000 */
    public static final sj0 f18762Oooo000 = new sj0(5);

    /* renamed from: OooOoo */
    public final C1993r f18763OooOoo;

    /* renamed from: OooOooO */
    public final Context f18764OooOooO;

    /* renamed from: OooOooo */
    public final de0 f18765OooOooo;

    public C1553f2(C2143v1 c2143v1, C2104u c2104u, int i, Context context, C1993r c1993r, de0 de0Var) {
        super(c2143v1, "oRkhOtgSewU4ggMi3si9uC+Dt7XbP2h/HAjAAMrrDLJEH1okiq6gMjsyB44PqaXr", "iO2i4E5kKwgdMIyURHCZV/iLx1KtGqgpgsfiaMoXkaQ=", c2104u, i, 27);
        this.f18764OooOooO = context;
        this.f18763OooOoo = c1993r;
        this.f18765OooOooo = de0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0042 A[Catch: all -> 0x003f, TryCatch #2 {all -> 0x003f, blocks: (B:90:0x000e, B:92:0x0018, B:94:0x001e, B:100:0x002a, B:102:0x0034, B:151:0x00f1, B:152:0x00f7, B:107:0x0042, B:109:0x0048, B:150:0x00ee, B:110:0x004e, B:112:0x0077, B:114:0x007d, B:116:0x0083, B:119:0x008b, B:125:0x0097, B:126:0x0099, B:128:0x009d, B:132:0x00a8, B:134:0x00af, B:133:0x00ad, B:135:0x00b2, B:137:0x00b8, B:139:0x00be, B:129:0x00a2, B:142:0x00c5, B:144:0x00dc, B:148:0x00e5), top: B:170:0x000e }] */
    @Override // com.google.android.gms.internal.ads.AbstractCallableC1959q2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void OooO00o() {
        /*
            Method dump skipped, instructions count: 332
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1553f2.OooO00o():void");
    }

    public final String OooO0OO() throws PackageManager.NameNotFoundException, CertificateException {
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance(AndroidStaticDeviceInfoDataSource.CERTIFICATE_TYPE_X509);
            byte[] bArrOooO0O0 = AbstractC2217x1.OooO0O0((String) zzbe.zzc().OooO00o(AbstractC1448c7.f17934oOO00O));
            ArrayList arrayList = new ArrayList();
            arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(bArrOooO0O0)));
            if (!Build.TYPE.equals("user")) {
                arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(AbstractC2217x1.OooO0O0((String) zzbe.zzc().OooO00o(AbstractC1448c7.f17860o00O00OO)))));
            }
            Context context = this.f18764OooOooO;
            String packageName = context.getPackageName();
            this.f23489OooOo0O.getClass();
            if (Build.VERSION.SDK_INT <= 30 && !Build.VERSION.CODENAME.equals("S")) {
                return null;
            }
            jq0 jq0Var = new jq0();
            context.getPackageManager().requestChecksums(packageName, false, 8, arrayList, new PackageManagerOnChecksumsReadyListenerC2068t0(jq0Var));
            return (String) jq0Var.get();
        } catch (PackageManager.NameNotFoundException | InterruptedException | NoClassDefFoundError | CertificateEncodingException | CertificateException | ExecutionException unused) {
            return null;
        }
    }

    public final C1994r0 OooO0Oo() {
        String str;
        nq0 nq0Var;
        int iIntValue = ((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17869o00O0O0o)).booleanValue() ? ((Integer) zzbe.zzc().OooO00o(AbstractC1448c7.f17873o00O0OOo)).intValue() : this.f18763OooOoo.OooOo0o();
        C1994r0 c1994r0 = new C1994r0((String) this.f23491OooOoO.invoke(null, this.f18764OooOooO, Boolean.FALSE, ""));
        de0 de0Var = this.f18765OooOooo;
        if (de0Var == null || (nq0Var = (nq0) de0Var.f18242OooOo0o) == null) {
            str = "E";
        } else {
            try {
                str = (String) nq0Var.get(iIntValue, TimeUnit.MILLISECONDS);
            } catch (InterruptedException | ExecutionException | TimeoutException unused) {
            }
        }
        c1994r0.f23717OooO0oO = str;
        return c1994r0;
    }
}

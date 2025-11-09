package o000oo00;

import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import com.github.superadb.SplashActivity;
import org.apache.tika.fork.ForkServer;
import org.apache.tika.metadata.TikaCoreProperties;

/* loaded from: classes2.dex */
public abstract class o000oOoO {

    /* renamed from: OooO00o */
    public static final o000Ooo.o00oO0o f31096OooO00o = new o000Ooo.o00oO0o(5, false);

    /* renamed from: OooO0O0 */
    public static final o00Oo0 f31097OooO0O0 = new o00Oo0();

    public static String OooO00o(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < bArr.length; i++) {
            String hexString = Integer.toHexString(bArr[i] & ForkServer.ERROR);
            if (hexString.length() == 1) {
                sb.append('0');
            }
            sb.append(hexString);
            if (i < bArr.length - 1) {
                sb.append(TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER);
            }
        }
        return sb.toString();
    }

    public static String OooO0O0(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < bArr.length; i++) {
            String hexString = Integer.toHexString(bArr[i] & ForkServer.ERROR);
            if (hexString.length() == 1) {
                sb.append('0');
            }
            sb.append(hexString);
            if (i < bArr.length - 1) {
                sb.append(TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER);
            }
        }
        return sb.toString();
    }

    public static String OooO0OO(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < bArr.length; i++) {
            String hexString = Integer.toHexString(bArr[i] & ForkServer.ERROR);
            if (hexString.length() == 1) {
                sb.append('0');
            }
            sb.append(hexString);
            if (i < bArr.length - 1) {
                sb.append(TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER);
            }
        }
        return sb.toString();
    }

    public static Signature[] OooO0Oo(SplashActivity splashActivity) {
        PackageManager packageManager = splashActivity.getPackageManager();
        String packageName = splashActivity.getPackageName();
        if (Build.VERSION.SDK_INT < 28) {
            return packageManager.getPackageInfo(packageName, 64).signatures;
        }
        SigningInfo signingInfo = packageManager.getPackageInfo(packageName, 134217728).signingInfo;
        if (signingInfo == null) {
            return null;
        }
        if (signingInfo.hasMultipleSigners()) {
            return signingInfo.getApkContentsSigners();
        }
        Signature[] signingCertificateHistory = signingInfo.getSigningCertificateHistory();
        if (signingCertificateHistory == null || signingCertificateHistory.length <= 0) {
            return null;
        }
        return new Signature[]{signingCertificateHistory[0]};
    }

    public static Signature[] OooO0o(SplashActivity splashActivity) {
        PackageManager packageManager = splashActivity.getPackageManager();
        String packageName = splashActivity.getPackageName();
        if (Build.VERSION.SDK_INT < 28) {
            return packageManager.getPackageInfo(packageName, 64).signatures;
        }
        SigningInfo signingInfo = packageManager.getPackageInfo(packageName, 134217728).signingInfo;
        if (signingInfo == null) {
            return null;
        }
        if (signingInfo.hasMultipleSigners()) {
            return signingInfo.getApkContentsSigners();
        }
        Signature[] signingCertificateHistory = signingInfo.getSigningCertificateHistory();
        if (signingCertificateHistory == null || signingCertificateHistory.length <= 0) {
            return null;
        }
        return new Signature[]{signingCertificateHistory[0]};
    }

    public static Signature[] OooO0o0(SplashActivity splashActivity) {
        PackageManager packageManager = splashActivity.getPackageManager();
        String packageName = splashActivity.getPackageName();
        if (Build.VERSION.SDK_INT < 28) {
            return packageManager.getPackageInfo(packageName, 64).signatures;
        }
        SigningInfo signingInfo = packageManager.getPackageInfo(packageName, 134217728).signingInfo;
        if (signingInfo == null) {
            return null;
        }
        if (signingInfo.hasMultipleSigners()) {
            return signingInfo.getApkContentsSigners();
        }
        Signature[] signingCertificateHistory = signingInfo.getSigningCertificateHistory();
        if (signingCertificateHistory == null || signingCertificateHistory.length <= 0) {
            return null;
        }
        return new Signature[]{signingCertificateHistory[0]};
    }
}

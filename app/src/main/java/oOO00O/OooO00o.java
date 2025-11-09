package oOO00O;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import kotlin.jvm.internal.OooOo;
import o00O0.OooOOO;
import org.apache.tika.fork.ForkServer;

/* loaded from: classes3.dex */
public final class OooO00o implements MethodChannel.MethodCallHandler, FlutterPlugin {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public Context f33153OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public MethodChannel f33154OooOo0o;

    public static long OooO0OO(PackageInfo packageInfo) {
        return Build.VERSION.SDK_INT >= 28 ? packageInfo.getLongVersionCode() : packageInfo.versionCode;
    }

    public static String OooO0Oo(byte[] bArr) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        messageDigest.update(bArr);
        byte[] bArrDigest = messageDigest.digest();
        OooOo.OooO0O0(bArrDigest);
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        char[] cArr2 = new char[bArrDigest.length * 2];
        int length = bArrDigest.length;
        for (int i = 0; i < length; i++) {
            byte b = bArrDigest[i];
            int i2 = i * 2;
            cArr2[i2] = cArr[(b & ForkServer.ERROR) >>> 4];
            cArr2[i2 + 1] = cArr[b & 15];
        }
        return new String(cArr2);
    }

    public final String OooO00o(PackageManager packageManager) {
        try {
            if (Build.VERSION.SDK_INT < 28) {
                Context context = this.f33153OooOo0O;
                OooOo.OooO0O0(context);
                Signature[] signatureArr = packageManager.getPackageInfo(context.getPackageName(), 64).signatures;
                if (signatureArr != null && signatureArr.length != 0 && OooOOO.OoooOO0(signatureArr) != null) {
                    byte[] byteArray = ((Signature) OooOOO.OoooOO0(signatureArr)).toByteArray();
                    OooOo.OooO0Oo(byteArray, "toByteArray(...)");
                    return OooO0Oo(byteArray);
                }
                return null;
            }
            Context context2 = this.f33153OooOo0O;
            OooOo.OooO0O0(context2);
            SigningInfo signingInfo = packageManager.getPackageInfo(context2.getPackageName(), 134217728).signingInfo;
            if (signingInfo == null) {
                return null;
            }
            if (signingInfo.hasMultipleSigners()) {
                Signature[] apkContentsSigners = signingInfo.getApkContentsSigners();
                OooOo.OooO0Oo(apkContentsSigners, "getApkContentsSigners(...)");
                byte[] byteArray2 = ((Signature) OooOOO.OoooOO0(apkContentsSigners)).toByteArray();
                OooOo.OooO0Oo(byteArray2, "toByteArray(...)");
                return OooO0Oo(byteArray2);
            }
            Signature[] signingCertificateHistory = signingInfo.getSigningCertificateHistory();
            OooOo.OooO0Oo(signingCertificateHistory, "getSigningCertificateHistory(...)");
            byte[] byteArray3 = ((Signature) OooOOO.OoooOO0(signingCertificateHistory)).toByteArray();
            OooOo.OooO0Oo(byteArray3, "toByteArray(...)");
            return OooO0Oo(byteArray3);
        } catch (PackageManager.NameNotFoundException | NoSuchAlgorithmException unused) {
            return null;
        }
    }

    public final String OooO0O0() {
        Context context = this.f33153OooOo0O;
        OooOo.OooO0O0(context);
        PackageManager packageManager = context.getPackageManager();
        Context context2 = this.f33153OooOo0O;
        OooOo.OooO0O0(context2);
        String packageName = context2.getPackageName();
        return Build.VERSION.SDK_INT >= 30 ? packageManager.getInstallSourceInfo(packageName).getInitiatingPackageName() : packageManager.getInstallerPackageName(packageName);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public final void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding binding) {
        OooOo.OooO0o0(binding, "binding");
        this.f33153OooOo0O = binding.getApplicationContext();
        MethodChannel methodChannel = new MethodChannel(binding.getBinaryMessenger(), "dev.fluttercommunity.plus/package_info");
        this.f33154OooOo0o = methodChannel;
        methodChannel.setMethodCallHandler(this);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public final void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding binding) {
        OooOo.OooO0o0(binding, "binding");
        this.f33153OooOo0O = null;
        MethodChannel methodChannel = this.f33154OooOo0o;
        OooOo.OooO0O0(methodChannel);
        methodChannel.setMethodCallHandler(null);
        this.f33154OooOo0o = null;
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public final void onMethodCall(MethodCall call, MethodChannel.Result result) throws PackageManager.NameNotFoundException {
        String string;
        CharSequence charSequenceLoadLabel;
        OooOo.OooO0o0(call, "call");
        OooOo.OooO0o0(result, "result");
        try {
            if (!OooOo.OooO00o(call.method, "getAll")) {
                result.notImplemented();
                return;
            }
            Context context = this.f33153OooOo0O;
            OooOo.OooO0O0(context);
            PackageManager packageManager = context.getPackageManager();
            Context context2 = this.f33153OooOo0O;
            OooOo.OooO0O0(context2);
            PackageInfo packageInfo = packageManager.getPackageInfo(context2.getPackageName(), 0);
            String strOooO00o = OooO00o(packageManager);
            String strOooO0O0 = OooO0O0();
            long j = packageInfo.firstInstallTime;
            long j2 = packageInfo.lastUpdateTime;
            HashMap map = new HashMap();
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            String str = "";
            if (applicationInfo == null || (charSequenceLoadLabel = applicationInfo.loadLabel(packageManager)) == null || (string = charSequenceLoadLabel.toString()) == null) {
                string = "";
            }
            map.put("appName", string);
            Context context3 = this.f33153OooOo0O;
            OooOo.OooO0O0(context3);
            map.put(HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME, context3.getPackageName());
            String str2 = packageInfo.versionName;
            if (str2 != null) {
                str = str2;
            }
            map.put("version", str);
            map.put("buildNumber", String.valueOf(OooO0OO(packageInfo)));
            if (strOooO00o != null) {
                map.put("buildSignature", strOooO00o);
            }
            if (strOooO0O0 != null) {
                map.put("installerStore", strOooO0O0);
            }
            map.put("installTime", String.valueOf(j));
            map.put("updateTime", String.valueOf(j2));
            result.success(map);
        } catch (PackageManager.NameNotFoundException e) {
            result.error("Name not found", e.getMessage(), null);
        }
    }
}

package io.flutter.plugins.webviewflutter;

import android.net.http.SslCertificate;
import android.net.http.SslError;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.webkit.ClientCertRequest;
import android.webkit.ConsoleMessage;
import android.webkit.CookieManager;
import android.webkit.DownloadListener;
import android.webkit.GeolocationPermissions;
import android.webkit.HttpAuthHandler;
import android.webkit.PermissionRequest;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.webkit.WebResourceErrorCompat;
import androidx.webkit.WebSettingsCompat;
import androidx.webkit.WebViewFeature;
import io.flutter.plugins.webviewflutter.WebChromeClientProxyApi;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.security.PrivateKey;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
final class AndroidWebkitLibraryPigeonProxyApiBaseCodec extends AndroidWebkitLibraryPigeonCodec {
    private final AndroidWebkitLibraryPigeonProxyApiRegistrar registrar;

    public AndroidWebkitLibraryPigeonProxyApiBaseCodec(AndroidWebkitLibraryPigeonProxyApiRegistrar registrar) {
        kotlin.jvm.internal.OooOo.OooO0o0(registrar, "registrar");
        this.registrar = registrar;
    }

    public static final oo00o.OooOo writeValue$lambda$0(oo00o.OooOOO0 oooOOO0) {
        return oo00o.OooOo.f33195OooO00o;
    }

    public static final oo00o.OooOo writeValue$lambda$1(oo00o.OooOOO0 oooOOO0) {
        return oo00o.OooOo.f33195OooO00o;
    }

    public static final oo00o.OooOo writeValue$lambda$10(oo00o.OooOOO0 oooOOO0) {
        return oo00o.OooOo.f33195OooO00o;
    }

    public static final oo00o.OooOo writeValue$lambda$11(oo00o.OooOOO0 oooOOO0) {
        return oo00o.OooOo.f33195OooO00o;
    }

    public static final oo00o.OooOo writeValue$lambda$12(oo00o.OooOOO0 oooOOO0) {
        return oo00o.OooOo.f33195OooO00o;
    }

    public static final oo00o.OooOo writeValue$lambda$13(oo00o.OooOOO0 oooOOO0) {
        return oo00o.OooOo.f33195OooO00o;
    }

    public static final oo00o.OooOo writeValue$lambda$14(oo00o.OooOOO0 oooOOO0) {
        return oo00o.OooOo.f33195OooO00o;
    }

    public static final oo00o.OooOo writeValue$lambda$15(oo00o.OooOOO0 oooOOO0) {
        return oo00o.OooOo.f33195OooO00o;
    }

    public static final oo00o.OooOo writeValue$lambda$16(oo00o.OooOOO0 oooOOO0) {
        return oo00o.OooOo.f33195OooO00o;
    }

    public static final oo00o.OooOo writeValue$lambda$17(oo00o.OooOOO0 oooOOO0) {
        return oo00o.OooOo.f33195OooO00o;
    }

    public static final oo00o.OooOo writeValue$lambda$18(oo00o.OooOOO0 oooOOO0) {
        return oo00o.OooOo.f33195OooO00o;
    }

    public static final oo00o.OooOo writeValue$lambda$19(oo00o.OooOOO0 oooOOO0) {
        return oo00o.OooOo.f33195OooO00o;
    }

    public static final oo00o.OooOo writeValue$lambda$2(oo00o.OooOOO0 oooOOO0) {
        return oo00o.OooOo.f33195OooO00o;
    }

    public static final oo00o.OooOo writeValue$lambda$20(oo00o.OooOOO0 oooOOO0) {
        return oo00o.OooOo.f33195OooO00o;
    }

    public static final oo00o.OooOo writeValue$lambda$21(oo00o.OooOOO0 oooOOO0) {
        return oo00o.OooOo.f33195OooO00o;
    }

    public static final oo00o.OooOo writeValue$lambda$22(oo00o.OooOOO0 oooOOO0) {
        return oo00o.OooOo.f33195OooO00o;
    }

    public static final oo00o.OooOo writeValue$lambda$23(oo00o.OooOOO0 oooOOO0) {
        return oo00o.OooOo.f33195OooO00o;
    }

    public static final oo00o.OooOo writeValue$lambda$24(oo00o.OooOOO0 oooOOO0) {
        return oo00o.OooOo.f33195OooO00o;
    }

    public static final oo00o.OooOo writeValue$lambda$25(oo00o.OooOOO0 oooOOO0) {
        return oo00o.OooOo.f33195OooO00o;
    }

    public static final oo00o.OooOo writeValue$lambda$26(oo00o.OooOOO0 oooOOO0) {
        return oo00o.OooOo.f33195OooO00o;
    }

    public static final oo00o.OooOo writeValue$lambda$27(oo00o.OooOOO0 oooOOO0) {
        return oo00o.OooOo.f33195OooO00o;
    }

    public static final oo00o.OooOo writeValue$lambda$28(oo00o.OooOOO0 oooOOO0) {
        return oo00o.OooOo.f33195OooO00o;
    }

    public static final oo00o.OooOo writeValue$lambda$29(oo00o.OooOOO0 oooOOO0) {
        return oo00o.OooOo.f33195OooO00o;
    }

    public static final oo00o.OooOo writeValue$lambda$3(oo00o.OooOOO0 oooOOO0) {
        return oo00o.OooOo.f33195OooO00o;
    }

    public static final oo00o.OooOo writeValue$lambda$30(oo00o.OooOOO0 oooOOO0) {
        return oo00o.OooOo.f33195OooO00o;
    }

    public static final oo00o.OooOo writeValue$lambda$31(oo00o.OooOOO0 oooOOO0) {
        return oo00o.OooOo.f33195OooO00o;
    }

    public static final oo00o.OooOo writeValue$lambda$4(oo00o.OooOOO0 oooOOO0) {
        return oo00o.OooOo.f33195OooO00o;
    }

    public static final oo00o.OooOo writeValue$lambda$5(oo00o.OooOOO0 oooOOO0) {
        return oo00o.OooOo.f33195OooO00o;
    }

    public static final oo00o.OooOo writeValue$lambda$6(oo00o.OooOOO0 oooOOO0) {
        return oo00o.OooOo.f33195OooO00o;
    }

    public static final oo00o.OooOo writeValue$lambda$7(oo00o.OooOOO0 oooOOO0) {
        return oo00o.OooOo.f33195OooO00o;
    }

    public static final oo00o.OooOo writeValue$lambda$8(oo00o.OooOOO0 oooOOO0) {
        return oo00o.OooOo.f33195OooO00o;
    }

    public static final oo00o.OooOo writeValue$lambda$9(oo00o.OooOOO0 oooOOO0) {
        return oo00o.OooOo.f33195OooO00o;
    }

    public final AndroidWebkitLibraryPigeonProxyApiRegistrar getRegistrar() {
        return this.registrar;
    }

    @Override // io.flutter.plugins.webviewflutter.AndroidWebkitLibraryPigeonCodec, io.flutter.plugin.common.StandardMessageCodec
    public Object readValueOfType(byte b, ByteBuffer buffer) {
        kotlin.jvm.internal.OooOo.OooO0o0(buffer, "buffer");
        if (b != -128) {
            return super.readValueOfType(b, buffer);
        }
        Object value = readValue(buffer);
        kotlin.jvm.internal.OooOo.OooO0OO(value, "null cannot be cast to non-null type kotlin.Long");
        long jLongValue = ((Long) value).longValue();
        Object androidWebkitLibraryPigeonInstanceManager = this.registrar.getInstanceManager().getInstance(jLongValue);
        if (androidWebkitLibraryPigeonInstanceManager == null) {
            Log.e("PigeonProxyApiBaseCodec", "Failed to find instance with identifier: " + jLongValue);
        }
        return androidWebkitLibraryPigeonInstanceManager;
    }

    @Override // io.flutter.plugins.webviewflutter.AndroidWebkitLibraryPigeonCodec, io.flutter.plugin.common.StandardMessageCodec
    public void writeValue(ByteArrayOutputStream stream, Object obj) {
        kotlin.jvm.internal.OooOo.OooO0o0(stream, "stream");
        if ((obj instanceof Boolean) || (obj instanceof byte[]) || (obj instanceof Double) || (obj instanceof double[]) || (obj instanceof float[]) || (obj instanceof Integer) || (obj instanceof int[]) || (obj instanceof List) || (obj instanceof Long) || (obj instanceof long[]) || (obj instanceof Map) || (obj instanceof String) || (obj instanceof FileChooserMode) || (obj instanceof ConsoleMessageLevel) || (obj instanceof OverScrollMode) || (obj instanceof SslErrorType) || (obj instanceof MixedContentMode) || obj == null) {
            super.writeValue(stream, obj);
            return;
        }
        if (obj instanceof WebResourceRequest) {
            final int i = 0;
            this.registrar.getPigeonApiWebResourceRequest().pigeon_newInstance((WebResourceRequest) obj, new o00O0Oo.Oooo000() { // from class: io.flutter.plugins.webviewflutter.OooO
                @Override // o00O0Oo.Oooo000
                public final Object invoke(Object obj2) {
                    oo00o.OooOOO0 oooOOO0 = (oo00o.OooOOO0) obj2;
                    switch (i) {
                        case 0:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$0(oooOOO0);
                        case 1:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$19(oooOOO0);
                        case 2:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$1(oooOOO0);
                        case 3:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$20(oooOOO0);
                        case 4:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$21(oooOOO0);
                        case 5:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$22(oooOOO0);
                        case 6:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$23(oooOOO0);
                        case 7:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$24(oooOOO0);
                        case 8:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$25(oooOOO0);
                        case 9:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$26(oooOOO0);
                        case 10:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$27(oooOOO0);
                        case 11:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$10(oooOOO0);
                        case 12:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$28(oooOOO0);
                        case 13:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$29(oooOOO0);
                        case 14:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$2(oooOOO0);
                        case 15:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$30(oooOOO0);
                        case 16:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$31(oooOOO0);
                        case 17:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$3(oooOOO0);
                        case 18:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$4(oooOOO0);
                        case 19:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$5(oooOOO0);
                        case 20:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$6(oooOOO0);
                        case 21:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$7(oooOOO0);
                        case 22:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$11(oooOOO0);
                        case 23:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$8(oooOOO0);
                        case 24:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$9(oooOOO0);
                        case 25:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$12(oooOOO0);
                        case 26:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$13(oooOOO0);
                        case 27:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$14(oooOOO0);
                        case 28:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$15(oooOOO0);
                        default:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$16(oooOOO0);
                    }
                }
            });
        } else if (obj instanceof WebResourceResponse) {
            final int i2 = 2;
            this.registrar.getPigeonApiWebResourceResponse().pigeon_newInstance((WebResourceResponse) obj, new o00O0Oo.Oooo000() { // from class: io.flutter.plugins.webviewflutter.OooO
                @Override // o00O0Oo.Oooo000
                public final Object invoke(Object obj2) {
                    oo00o.OooOOO0 oooOOO0 = (oo00o.OooOOO0) obj2;
                    switch (i2) {
                        case 0:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$0(oooOOO0);
                        case 1:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$19(oooOOO0);
                        case 2:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$1(oooOOO0);
                        case 3:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$20(oooOOO0);
                        case 4:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$21(oooOOO0);
                        case 5:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$22(oooOOO0);
                        case 6:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$23(oooOOO0);
                        case 7:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$24(oooOOO0);
                        case 8:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$25(oooOOO0);
                        case 9:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$26(oooOOO0);
                        case 10:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$27(oooOOO0);
                        case 11:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$10(oooOOO0);
                        case 12:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$28(oooOOO0);
                        case 13:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$29(oooOOO0);
                        case 14:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$2(oooOOO0);
                        case 15:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$30(oooOOO0);
                        case 16:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$31(oooOOO0);
                        case 17:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$3(oooOOO0);
                        case 18:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$4(oooOOO0);
                        case 19:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$5(oooOOO0);
                        case 20:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$6(oooOOO0);
                        case 21:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$7(oooOOO0);
                        case 22:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$11(oooOOO0);
                        case 23:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$8(oooOOO0);
                        case 24:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$9(oooOOO0);
                        case 25:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$12(oooOOO0);
                        case 26:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$13(oooOOO0);
                        case 27:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$14(oooOOO0);
                        case 28:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$15(oooOOO0);
                        default:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$16(oooOOO0);
                    }
                }
            });
        } else if (obj instanceof WebResourceError) {
            final int i3 = 14;
            this.registrar.getPigeonApiWebResourceError().pigeon_newInstance((WebResourceError) obj, new o00O0Oo.Oooo000() { // from class: io.flutter.plugins.webviewflutter.OooO
                @Override // o00O0Oo.Oooo000
                public final Object invoke(Object obj2) {
                    oo00o.OooOOO0 oooOOO0 = (oo00o.OooOOO0) obj2;
                    switch (i3) {
                        case 0:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$0(oooOOO0);
                        case 1:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$19(oooOOO0);
                        case 2:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$1(oooOOO0);
                        case 3:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$20(oooOOO0);
                        case 4:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$21(oooOOO0);
                        case 5:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$22(oooOOO0);
                        case 6:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$23(oooOOO0);
                        case 7:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$24(oooOOO0);
                        case 8:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$25(oooOOO0);
                        case 9:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$26(oooOOO0);
                        case 10:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$27(oooOOO0);
                        case 11:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$10(oooOOO0);
                        case 12:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$28(oooOOO0);
                        case 13:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$29(oooOOO0);
                        case 14:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$2(oooOOO0);
                        case 15:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$30(oooOOO0);
                        case 16:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$31(oooOOO0);
                        case 17:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$3(oooOOO0);
                        case 18:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$4(oooOOO0);
                        case 19:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$5(oooOOO0);
                        case 20:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$6(oooOOO0);
                        case 21:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$7(oooOOO0);
                        case 22:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$11(oooOOO0);
                        case 23:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$8(oooOOO0);
                        case 24:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$9(oooOOO0);
                        case 25:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$12(oooOOO0);
                        case 26:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$13(oooOOO0);
                        case 27:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$14(oooOOO0);
                        case 28:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$15(oooOOO0);
                        default:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$16(oooOOO0);
                    }
                }
            });
        } else if (obj instanceof WebResourceErrorCompat) {
            final int i4 = 17;
            this.registrar.getPigeonApiWebResourceErrorCompat().pigeon_newInstance((WebResourceErrorCompat) obj, new o00O0Oo.Oooo000() { // from class: io.flutter.plugins.webviewflutter.OooO
                @Override // o00O0Oo.Oooo000
                public final Object invoke(Object obj2) {
                    oo00o.OooOOO0 oooOOO0 = (oo00o.OooOOO0) obj2;
                    switch (i4) {
                        case 0:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$0(oooOOO0);
                        case 1:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$19(oooOOO0);
                        case 2:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$1(oooOOO0);
                        case 3:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$20(oooOOO0);
                        case 4:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$21(oooOOO0);
                        case 5:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$22(oooOOO0);
                        case 6:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$23(oooOOO0);
                        case 7:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$24(oooOOO0);
                        case 8:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$25(oooOOO0);
                        case 9:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$26(oooOOO0);
                        case 10:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$27(oooOOO0);
                        case 11:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$10(oooOOO0);
                        case 12:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$28(oooOOO0);
                        case 13:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$29(oooOOO0);
                        case 14:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$2(oooOOO0);
                        case 15:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$30(oooOOO0);
                        case 16:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$31(oooOOO0);
                        case 17:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$3(oooOOO0);
                        case 18:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$4(oooOOO0);
                        case 19:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$5(oooOOO0);
                        case 20:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$6(oooOOO0);
                        case 21:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$7(oooOOO0);
                        case 22:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$11(oooOOO0);
                        case 23:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$8(oooOOO0);
                        case 24:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$9(oooOOO0);
                        case 25:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$12(oooOOO0);
                        case 26:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$13(oooOOO0);
                        case 27:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$14(oooOOO0);
                        case 28:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$15(oooOOO0);
                        default:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$16(oooOOO0);
                    }
                }
            });
        } else if (obj instanceof WebViewPoint) {
            final int i5 = 18;
            this.registrar.getPigeonApiWebViewPoint().pigeon_newInstance((WebViewPoint) obj, new o00O0Oo.Oooo000() { // from class: io.flutter.plugins.webviewflutter.OooO
                @Override // o00O0Oo.Oooo000
                public final Object invoke(Object obj2) {
                    oo00o.OooOOO0 oooOOO0 = (oo00o.OooOOO0) obj2;
                    switch (i5) {
                        case 0:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$0(oooOOO0);
                        case 1:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$19(oooOOO0);
                        case 2:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$1(oooOOO0);
                        case 3:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$20(oooOOO0);
                        case 4:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$21(oooOOO0);
                        case 5:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$22(oooOOO0);
                        case 6:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$23(oooOOO0);
                        case 7:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$24(oooOOO0);
                        case 8:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$25(oooOOO0);
                        case 9:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$26(oooOOO0);
                        case 10:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$27(oooOOO0);
                        case 11:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$10(oooOOO0);
                        case 12:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$28(oooOOO0);
                        case 13:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$29(oooOOO0);
                        case 14:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$2(oooOOO0);
                        case 15:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$30(oooOOO0);
                        case 16:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$31(oooOOO0);
                        case 17:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$3(oooOOO0);
                        case 18:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$4(oooOOO0);
                        case 19:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$5(oooOOO0);
                        case 20:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$6(oooOOO0);
                        case 21:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$7(oooOOO0);
                        case 22:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$11(oooOOO0);
                        case 23:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$8(oooOOO0);
                        case 24:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$9(oooOOO0);
                        case 25:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$12(oooOOO0);
                        case 26:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$13(oooOOO0);
                        case 27:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$14(oooOOO0);
                        case 28:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$15(oooOOO0);
                        default:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$16(oooOOO0);
                    }
                }
            });
        } else if (obj instanceof ConsoleMessage) {
            final int i6 = 19;
            this.registrar.getPigeonApiConsoleMessage().pigeon_newInstance((ConsoleMessage) obj, new o00O0Oo.Oooo000() { // from class: io.flutter.plugins.webviewflutter.OooO
                @Override // o00O0Oo.Oooo000
                public final Object invoke(Object obj2) {
                    oo00o.OooOOO0 oooOOO0 = (oo00o.OooOOO0) obj2;
                    switch (i6) {
                        case 0:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$0(oooOOO0);
                        case 1:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$19(oooOOO0);
                        case 2:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$1(oooOOO0);
                        case 3:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$20(oooOOO0);
                        case 4:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$21(oooOOO0);
                        case 5:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$22(oooOOO0);
                        case 6:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$23(oooOOO0);
                        case 7:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$24(oooOOO0);
                        case 8:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$25(oooOOO0);
                        case 9:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$26(oooOOO0);
                        case 10:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$27(oooOOO0);
                        case 11:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$10(oooOOO0);
                        case 12:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$28(oooOOO0);
                        case 13:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$29(oooOOO0);
                        case 14:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$2(oooOOO0);
                        case 15:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$30(oooOOO0);
                        case 16:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$31(oooOOO0);
                        case 17:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$3(oooOOO0);
                        case 18:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$4(oooOOO0);
                        case 19:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$5(oooOOO0);
                        case 20:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$6(oooOOO0);
                        case 21:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$7(oooOOO0);
                        case 22:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$11(oooOOO0);
                        case 23:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$8(oooOOO0);
                        case 24:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$9(oooOOO0);
                        case 25:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$12(oooOOO0);
                        case 26:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$13(oooOOO0);
                        case 27:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$14(oooOOO0);
                        case 28:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$15(oooOOO0);
                        default:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$16(oooOOO0);
                    }
                }
            });
        } else if (obj instanceof CookieManager) {
            final int i7 = 20;
            this.registrar.getPigeonApiCookieManager().pigeon_newInstance((CookieManager) obj, new o00O0Oo.Oooo000() { // from class: io.flutter.plugins.webviewflutter.OooO
                @Override // o00O0Oo.Oooo000
                public final Object invoke(Object obj2) {
                    oo00o.OooOOO0 oooOOO0 = (oo00o.OooOOO0) obj2;
                    switch (i7) {
                        case 0:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$0(oooOOO0);
                        case 1:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$19(oooOOO0);
                        case 2:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$1(oooOOO0);
                        case 3:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$20(oooOOO0);
                        case 4:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$21(oooOOO0);
                        case 5:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$22(oooOOO0);
                        case 6:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$23(oooOOO0);
                        case 7:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$24(oooOOO0);
                        case 8:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$25(oooOOO0);
                        case 9:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$26(oooOOO0);
                        case 10:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$27(oooOOO0);
                        case 11:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$10(oooOOO0);
                        case 12:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$28(oooOOO0);
                        case 13:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$29(oooOOO0);
                        case 14:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$2(oooOOO0);
                        case 15:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$30(oooOOO0);
                        case 16:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$31(oooOOO0);
                        case 17:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$3(oooOOO0);
                        case 18:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$4(oooOOO0);
                        case 19:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$5(oooOOO0);
                        case 20:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$6(oooOOO0);
                        case 21:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$7(oooOOO0);
                        case 22:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$11(oooOOO0);
                        case 23:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$8(oooOOO0);
                        case 24:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$9(oooOOO0);
                        case 25:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$12(oooOOO0);
                        case 26:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$13(oooOOO0);
                        case 27:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$14(oooOOO0);
                        case 28:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$15(oooOOO0);
                        default:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$16(oooOOO0);
                    }
                }
            });
        } else if (obj instanceof WebView) {
            final int i8 = 21;
            this.registrar.getPigeonApiWebView().pigeon_newInstance((WebView) obj, new o00O0Oo.Oooo000() { // from class: io.flutter.plugins.webviewflutter.OooO
                @Override // o00O0Oo.Oooo000
                public final Object invoke(Object obj2) {
                    oo00o.OooOOO0 oooOOO0 = (oo00o.OooOOO0) obj2;
                    switch (i8) {
                        case 0:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$0(oooOOO0);
                        case 1:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$19(oooOOO0);
                        case 2:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$1(oooOOO0);
                        case 3:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$20(oooOOO0);
                        case 4:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$21(oooOOO0);
                        case 5:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$22(oooOOO0);
                        case 6:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$23(oooOOO0);
                        case 7:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$24(oooOOO0);
                        case 8:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$25(oooOOO0);
                        case 9:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$26(oooOOO0);
                        case 10:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$27(oooOOO0);
                        case 11:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$10(oooOOO0);
                        case 12:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$28(oooOOO0);
                        case 13:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$29(oooOOO0);
                        case 14:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$2(oooOOO0);
                        case 15:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$30(oooOOO0);
                        case 16:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$31(oooOOO0);
                        case 17:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$3(oooOOO0);
                        case 18:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$4(oooOOO0);
                        case 19:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$5(oooOOO0);
                        case 20:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$6(oooOOO0);
                        case 21:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$7(oooOOO0);
                        case 22:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$11(oooOOO0);
                        case 23:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$8(oooOOO0);
                        case 24:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$9(oooOOO0);
                        case 25:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$12(oooOOO0);
                        case 26:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$13(oooOOO0);
                        case 27:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$14(oooOOO0);
                        case 28:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$15(oooOOO0);
                        default:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$16(oooOOO0);
                    }
                }
            });
        } else if (obj instanceof WebSettings) {
            final int i9 = 23;
            this.registrar.getPigeonApiWebSettings().pigeon_newInstance((WebSettings) obj, new o00O0Oo.Oooo000() { // from class: io.flutter.plugins.webviewflutter.OooO
                @Override // o00O0Oo.Oooo000
                public final Object invoke(Object obj2) {
                    oo00o.OooOOO0 oooOOO0 = (oo00o.OooOOO0) obj2;
                    switch (i9) {
                        case 0:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$0(oooOOO0);
                        case 1:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$19(oooOOO0);
                        case 2:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$1(oooOOO0);
                        case 3:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$20(oooOOO0);
                        case 4:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$21(oooOOO0);
                        case 5:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$22(oooOOO0);
                        case 6:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$23(oooOOO0);
                        case 7:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$24(oooOOO0);
                        case 8:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$25(oooOOO0);
                        case 9:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$26(oooOOO0);
                        case 10:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$27(oooOOO0);
                        case 11:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$10(oooOOO0);
                        case 12:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$28(oooOOO0);
                        case 13:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$29(oooOOO0);
                        case 14:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$2(oooOOO0);
                        case 15:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$30(oooOOO0);
                        case 16:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$31(oooOOO0);
                        case 17:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$3(oooOOO0);
                        case 18:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$4(oooOOO0);
                        case 19:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$5(oooOOO0);
                        case 20:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$6(oooOOO0);
                        case 21:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$7(oooOOO0);
                        case 22:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$11(oooOOO0);
                        case 23:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$8(oooOOO0);
                        case 24:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$9(oooOOO0);
                        case 25:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$12(oooOOO0);
                        case 26:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$13(oooOOO0);
                        case 27:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$14(oooOOO0);
                        case 28:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$15(oooOOO0);
                        default:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$16(oooOOO0);
                    }
                }
            });
        } else if (obj instanceof JavaScriptChannel) {
            final int i10 = 24;
            this.registrar.getPigeonApiJavaScriptChannel().pigeon_newInstance((JavaScriptChannel) obj, new o00O0Oo.Oooo000() { // from class: io.flutter.plugins.webviewflutter.OooO
                @Override // o00O0Oo.Oooo000
                public final Object invoke(Object obj2) {
                    oo00o.OooOOO0 oooOOO0 = (oo00o.OooOOO0) obj2;
                    switch (i10) {
                        case 0:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$0(oooOOO0);
                        case 1:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$19(oooOOO0);
                        case 2:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$1(oooOOO0);
                        case 3:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$20(oooOOO0);
                        case 4:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$21(oooOOO0);
                        case 5:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$22(oooOOO0);
                        case 6:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$23(oooOOO0);
                        case 7:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$24(oooOOO0);
                        case 8:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$25(oooOOO0);
                        case 9:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$26(oooOOO0);
                        case 10:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$27(oooOOO0);
                        case 11:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$10(oooOOO0);
                        case 12:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$28(oooOOO0);
                        case 13:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$29(oooOOO0);
                        case 14:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$2(oooOOO0);
                        case 15:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$30(oooOOO0);
                        case 16:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$31(oooOOO0);
                        case 17:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$3(oooOOO0);
                        case 18:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$4(oooOOO0);
                        case 19:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$5(oooOOO0);
                        case 20:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$6(oooOOO0);
                        case 21:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$7(oooOOO0);
                        case 22:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$11(oooOOO0);
                        case 23:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$8(oooOOO0);
                        case 24:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$9(oooOOO0);
                        case 25:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$12(oooOOO0);
                        case 26:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$13(oooOOO0);
                        case 27:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$14(oooOOO0);
                        case 28:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$15(oooOOO0);
                        default:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$16(oooOOO0);
                    }
                }
            });
        } else if (obj instanceof WebViewClient) {
            final int i11 = 11;
            this.registrar.getPigeonApiWebViewClient().pigeon_newInstance((WebViewClient) obj, new o00O0Oo.Oooo000() { // from class: io.flutter.plugins.webviewflutter.OooO
                @Override // o00O0Oo.Oooo000
                public final Object invoke(Object obj2) {
                    oo00o.OooOOO0 oooOOO0 = (oo00o.OooOOO0) obj2;
                    switch (i11) {
                        case 0:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$0(oooOOO0);
                        case 1:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$19(oooOOO0);
                        case 2:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$1(oooOOO0);
                        case 3:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$20(oooOOO0);
                        case 4:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$21(oooOOO0);
                        case 5:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$22(oooOOO0);
                        case 6:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$23(oooOOO0);
                        case 7:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$24(oooOOO0);
                        case 8:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$25(oooOOO0);
                        case 9:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$26(oooOOO0);
                        case 10:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$27(oooOOO0);
                        case 11:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$10(oooOOO0);
                        case 12:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$28(oooOOO0);
                        case 13:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$29(oooOOO0);
                        case 14:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$2(oooOOO0);
                        case 15:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$30(oooOOO0);
                        case 16:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$31(oooOOO0);
                        case 17:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$3(oooOOO0);
                        case 18:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$4(oooOOO0);
                        case 19:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$5(oooOOO0);
                        case 20:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$6(oooOOO0);
                        case 21:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$7(oooOOO0);
                        case 22:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$11(oooOOO0);
                        case 23:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$8(oooOOO0);
                        case 24:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$9(oooOOO0);
                        case 25:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$12(oooOOO0);
                        case 26:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$13(oooOOO0);
                        case 27:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$14(oooOOO0);
                        case 28:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$15(oooOOO0);
                        default:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$16(oooOOO0);
                    }
                }
            });
        } else if (obj instanceof DownloadListener) {
            final int i12 = 22;
            this.registrar.getPigeonApiDownloadListener().pigeon_newInstance((DownloadListener) obj, new o00O0Oo.Oooo000() { // from class: io.flutter.plugins.webviewflutter.OooO
                @Override // o00O0Oo.Oooo000
                public final Object invoke(Object obj2) {
                    oo00o.OooOOO0 oooOOO0 = (oo00o.OooOOO0) obj2;
                    switch (i12) {
                        case 0:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$0(oooOOO0);
                        case 1:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$19(oooOOO0);
                        case 2:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$1(oooOOO0);
                        case 3:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$20(oooOOO0);
                        case 4:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$21(oooOOO0);
                        case 5:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$22(oooOOO0);
                        case 6:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$23(oooOOO0);
                        case 7:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$24(oooOOO0);
                        case 8:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$25(oooOOO0);
                        case 9:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$26(oooOOO0);
                        case 10:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$27(oooOOO0);
                        case 11:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$10(oooOOO0);
                        case 12:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$28(oooOOO0);
                        case 13:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$29(oooOOO0);
                        case 14:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$2(oooOOO0);
                        case 15:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$30(oooOOO0);
                        case 16:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$31(oooOOO0);
                        case 17:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$3(oooOOO0);
                        case 18:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$4(oooOOO0);
                        case 19:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$5(oooOOO0);
                        case 20:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$6(oooOOO0);
                        case 21:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$7(oooOOO0);
                        case 22:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$11(oooOOO0);
                        case 23:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$8(oooOOO0);
                        case 24:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$9(oooOOO0);
                        case 25:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$12(oooOOO0);
                        case 26:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$13(oooOOO0);
                        case 27:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$14(oooOOO0);
                        case 28:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$15(oooOOO0);
                        default:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$16(oooOOO0);
                    }
                }
            });
        } else if (obj instanceof WebChromeClientProxyApi.WebChromeClientImpl) {
            final int i13 = 25;
            this.registrar.getPigeonApiWebChromeClient().pigeon_newInstance((WebChromeClientProxyApi.WebChromeClientImpl) obj, new o00O0Oo.Oooo000() { // from class: io.flutter.plugins.webviewflutter.OooO
                @Override // o00O0Oo.Oooo000
                public final Object invoke(Object obj2) {
                    oo00o.OooOOO0 oooOOO0 = (oo00o.OooOOO0) obj2;
                    switch (i13) {
                        case 0:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$0(oooOOO0);
                        case 1:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$19(oooOOO0);
                        case 2:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$1(oooOOO0);
                        case 3:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$20(oooOOO0);
                        case 4:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$21(oooOOO0);
                        case 5:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$22(oooOOO0);
                        case 6:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$23(oooOOO0);
                        case 7:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$24(oooOOO0);
                        case 8:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$25(oooOOO0);
                        case 9:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$26(oooOOO0);
                        case 10:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$27(oooOOO0);
                        case 11:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$10(oooOOO0);
                        case 12:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$28(oooOOO0);
                        case 13:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$29(oooOOO0);
                        case 14:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$2(oooOOO0);
                        case 15:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$30(oooOOO0);
                        case 16:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$31(oooOOO0);
                        case 17:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$3(oooOOO0);
                        case 18:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$4(oooOOO0);
                        case 19:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$5(oooOOO0);
                        case 20:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$6(oooOOO0);
                        case 21:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$7(oooOOO0);
                        case 22:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$11(oooOOO0);
                        case 23:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$8(oooOOO0);
                        case 24:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$9(oooOOO0);
                        case 25:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$12(oooOOO0);
                        case 26:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$13(oooOOO0);
                        case 27:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$14(oooOOO0);
                        case 28:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$15(oooOOO0);
                        default:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$16(oooOOO0);
                    }
                }
            });
        } else if (obj instanceof FlutterAssetManager) {
            final int i14 = 26;
            this.registrar.getPigeonApiFlutterAssetManager().pigeon_newInstance((FlutterAssetManager) obj, new o00O0Oo.Oooo000() { // from class: io.flutter.plugins.webviewflutter.OooO
                @Override // o00O0Oo.Oooo000
                public final Object invoke(Object obj2) {
                    oo00o.OooOOO0 oooOOO0 = (oo00o.OooOOO0) obj2;
                    switch (i14) {
                        case 0:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$0(oooOOO0);
                        case 1:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$19(oooOOO0);
                        case 2:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$1(oooOOO0);
                        case 3:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$20(oooOOO0);
                        case 4:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$21(oooOOO0);
                        case 5:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$22(oooOOO0);
                        case 6:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$23(oooOOO0);
                        case 7:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$24(oooOOO0);
                        case 8:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$25(oooOOO0);
                        case 9:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$26(oooOOO0);
                        case 10:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$27(oooOOO0);
                        case 11:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$10(oooOOO0);
                        case 12:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$28(oooOOO0);
                        case 13:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$29(oooOOO0);
                        case 14:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$2(oooOOO0);
                        case 15:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$30(oooOOO0);
                        case 16:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$31(oooOOO0);
                        case 17:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$3(oooOOO0);
                        case 18:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$4(oooOOO0);
                        case 19:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$5(oooOOO0);
                        case 20:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$6(oooOOO0);
                        case 21:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$7(oooOOO0);
                        case 22:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$11(oooOOO0);
                        case 23:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$8(oooOOO0);
                        case 24:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$9(oooOOO0);
                        case 25:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$12(oooOOO0);
                        case 26:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$13(oooOOO0);
                        case 27:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$14(oooOOO0);
                        case 28:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$15(oooOOO0);
                        default:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$16(oooOOO0);
                    }
                }
            });
        } else if (obj instanceof WebStorage) {
            final int i15 = 27;
            this.registrar.getPigeonApiWebStorage().pigeon_newInstance((WebStorage) obj, new o00O0Oo.Oooo000() { // from class: io.flutter.plugins.webviewflutter.OooO
                @Override // o00O0Oo.Oooo000
                public final Object invoke(Object obj2) {
                    oo00o.OooOOO0 oooOOO0 = (oo00o.OooOOO0) obj2;
                    switch (i15) {
                        case 0:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$0(oooOOO0);
                        case 1:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$19(oooOOO0);
                        case 2:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$1(oooOOO0);
                        case 3:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$20(oooOOO0);
                        case 4:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$21(oooOOO0);
                        case 5:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$22(oooOOO0);
                        case 6:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$23(oooOOO0);
                        case 7:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$24(oooOOO0);
                        case 8:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$25(oooOOO0);
                        case 9:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$26(oooOOO0);
                        case 10:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$27(oooOOO0);
                        case 11:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$10(oooOOO0);
                        case 12:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$28(oooOOO0);
                        case 13:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$29(oooOOO0);
                        case 14:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$2(oooOOO0);
                        case 15:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$30(oooOOO0);
                        case 16:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$31(oooOOO0);
                        case 17:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$3(oooOOO0);
                        case 18:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$4(oooOOO0);
                        case 19:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$5(oooOOO0);
                        case 20:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$6(oooOOO0);
                        case 21:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$7(oooOOO0);
                        case 22:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$11(oooOOO0);
                        case 23:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$8(oooOOO0);
                        case 24:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$9(oooOOO0);
                        case 25:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$12(oooOOO0);
                        case 26:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$13(oooOOO0);
                        case 27:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$14(oooOOO0);
                        case 28:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$15(oooOOO0);
                        default:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$16(oooOOO0);
                    }
                }
            });
        } else if (obj instanceof WebChromeClient.FileChooserParams) {
            final int i16 = 28;
            this.registrar.getPigeonApiFileChooserParams().pigeon_newInstance((WebChromeClient.FileChooserParams) obj, new o00O0Oo.Oooo000() { // from class: io.flutter.plugins.webviewflutter.OooO
                @Override // o00O0Oo.Oooo000
                public final Object invoke(Object obj2) {
                    oo00o.OooOOO0 oooOOO0 = (oo00o.OooOOO0) obj2;
                    switch (i16) {
                        case 0:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$0(oooOOO0);
                        case 1:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$19(oooOOO0);
                        case 2:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$1(oooOOO0);
                        case 3:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$20(oooOOO0);
                        case 4:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$21(oooOOO0);
                        case 5:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$22(oooOOO0);
                        case 6:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$23(oooOOO0);
                        case 7:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$24(oooOOO0);
                        case 8:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$25(oooOOO0);
                        case 9:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$26(oooOOO0);
                        case 10:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$27(oooOOO0);
                        case 11:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$10(oooOOO0);
                        case 12:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$28(oooOOO0);
                        case 13:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$29(oooOOO0);
                        case 14:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$2(oooOOO0);
                        case 15:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$30(oooOOO0);
                        case 16:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$31(oooOOO0);
                        case 17:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$3(oooOOO0);
                        case 18:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$4(oooOOO0);
                        case 19:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$5(oooOOO0);
                        case 20:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$6(oooOOO0);
                        case 21:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$7(oooOOO0);
                        case 22:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$11(oooOOO0);
                        case 23:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$8(oooOOO0);
                        case 24:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$9(oooOOO0);
                        case 25:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$12(oooOOO0);
                        case 26:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$13(oooOOO0);
                        case 27:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$14(oooOOO0);
                        case 28:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$15(oooOOO0);
                        default:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$16(oooOOO0);
                    }
                }
            });
        } else if (obj instanceof PermissionRequest) {
            final int i17 = 29;
            this.registrar.getPigeonApiPermissionRequest().pigeon_newInstance((PermissionRequest) obj, new o00O0Oo.Oooo000() { // from class: io.flutter.plugins.webviewflutter.OooO
                @Override // o00O0Oo.Oooo000
                public final Object invoke(Object obj2) {
                    oo00o.OooOOO0 oooOOO0 = (oo00o.OooOOO0) obj2;
                    switch (i17) {
                        case 0:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$0(oooOOO0);
                        case 1:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$19(oooOOO0);
                        case 2:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$1(oooOOO0);
                        case 3:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$20(oooOOO0);
                        case 4:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$21(oooOOO0);
                        case 5:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$22(oooOOO0);
                        case 6:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$23(oooOOO0);
                        case 7:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$24(oooOOO0);
                        case 8:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$25(oooOOO0);
                        case 9:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$26(oooOOO0);
                        case 10:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$27(oooOOO0);
                        case 11:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$10(oooOOO0);
                        case 12:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$28(oooOOO0);
                        case 13:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$29(oooOOO0);
                        case 14:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$2(oooOOO0);
                        case 15:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$30(oooOOO0);
                        case 16:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$31(oooOOO0);
                        case 17:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$3(oooOOO0);
                        case 18:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$4(oooOOO0);
                        case 19:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$5(oooOOO0);
                        case 20:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$6(oooOOO0);
                        case 21:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$7(oooOOO0);
                        case 22:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$11(oooOOO0);
                        case 23:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$8(oooOOO0);
                        case 24:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$9(oooOOO0);
                        case 25:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$12(oooOOO0);
                        case 26:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$13(oooOOO0);
                        case 27:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$14(oooOOO0);
                        case 28:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$15(oooOOO0);
                        default:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$16(oooOOO0);
                    }
                }
            });
        } else if (obj instanceof WebChromeClient.CustomViewCallback) {
            this.registrar.getPigeonApiCustomViewCallback().pigeon_newInstance((WebChromeClient.CustomViewCallback) obj, new OooOO0(0));
        } else if (obj instanceof View) {
            this.registrar.getPigeonApiView().pigeon_newInstance((View) obj, new OooOO0(1));
        } else if (obj instanceof GeolocationPermissions.Callback) {
            final int i18 = 1;
            this.registrar.getPigeonApiGeolocationPermissionsCallback().pigeon_newInstance((GeolocationPermissions.Callback) obj, new o00O0Oo.Oooo000() { // from class: io.flutter.plugins.webviewflutter.OooO
                @Override // o00O0Oo.Oooo000
                public final Object invoke(Object obj2) {
                    oo00o.OooOOO0 oooOOO0 = (oo00o.OooOOO0) obj2;
                    switch (i18) {
                        case 0:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$0(oooOOO0);
                        case 1:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$19(oooOOO0);
                        case 2:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$1(oooOOO0);
                        case 3:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$20(oooOOO0);
                        case 4:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$21(oooOOO0);
                        case 5:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$22(oooOOO0);
                        case 6:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$23(oooOOO0);
                        case 7:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$24(oooOOO0);
                        case 8:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$25(oooOOO0);
                        case 9:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$26(oooOOO0);
                        case 10:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$27(oooOOO0);
                        case 11:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$10(oooOOO0);
                        case 12:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$28(oooOOO0);
                        case 13:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$29(oooOOO0);
                        case 14:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$2(oooOOO0);
                        case 15:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$30(oooOOO0);
                        case 16:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$31(oooOOO0);
                        case 17:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$3(oooOOO0);
                        case 18:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$4(oooOOO0);
                        case 19:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$5(oooOOO0);
                        case 20:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$6(oooOOO0);
                        case 21:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$7(oooOOO0);
                        case 22:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$11(oooOOO0);
                        case 23:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$8(oooOOO0);
                        case 24:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$9(oooOOO0);
                        case 25:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$12(oooOOO0);
                        case 26:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$13(oooOOO0);
                        case 27:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$14(oooOOO0);
                        case 28:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$15(oooOOO0);
                        default:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$16(oooOOO0);
                    }
                }
            });
        } else if (obj instanceof HttpAuthHandler) {
            final int i19 = 3;
            this.registrar.getPigeonApiHttpAuthHandler().pigeon_newInstance((HttpAuthHandler) obj, new o00O0Oo.Oooo000() { // from class: io.flutter.plugins.webviewflutter.OooO
                @Override // o00O0Oo.Oooo000
                public final Object invoke(Object obj2) {
                    oo00o.OooOOO0 oooOOO0 = (oo00o.OooOOO0) obj2;
                    switch (i19) {
                        case 0:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$0(oooOOO0);
                        case 1:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$19(oooOOO0);
                        case 2:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$1(oooOOO0);
                        case 3:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$20(oooOOO0);
                        case 4:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$21(oooOOO0);
                        case 5:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$22(oooOOO0);
                        case 6:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$23(oooOOO0);
                        case 7:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$24(oooOOO0);
                        case 8:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$25(oooOOO0);
                        case 9:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$26(oooOOO0);
                        case 10:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$27(oooOOO0);
                        case 11:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$10(oooOOO0);
                        case 12:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$28(oooOOO0);
                        case 13:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$29(oooOOO0);
                        case 14:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$2(oooOOO0);
                        case 15:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$30(oooOOO0);
                        case 16:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$31(oooOOO0);
                        case 17:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$3(oooOOO0);
                        case 18:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$4(oooOOO0);
                        case 19:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$5(oooOOO0);
                        case 20:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$6(oooOOO0);
                        case 21:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$7(oooOOO0);
                        case 22:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$11(oooOOO0);
                        case 23:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$8(oooOOO0);
                        case 24:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$9(oooOOO0);
                        case 25:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$12(oooOOO0);
                        case 26:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$13(oooOOO0);
                        case 27:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$14(oooOOO0);
                        case 28:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$15(oooOOO0);
                        default:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$16(oooOOO0);
                    }
                }
            });
        } else if (obj instanceof Message) {
            final int i20 = 4;
            this.registrar.getPigeonApiAndroidMessage().pigeon_newInstance((Message) obj, new o00O0Oo.Oooo000() { // from class: io.flutter.plugins.webviewflutter.OooO
                @Override // o00O0Oo.Oooo000
                public final Object invoke(Object obj2) {
                    oo00o.OooOOO0 oooOOO0 = (oo00o.OooOOO0) obj2;
                    switch (i20) {
                        case 0:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$0(oooOOO0);
                        case 1:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$19(oooOOO0);
                        case 2:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$1(oooOOO0);
                        case 3:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$20(oooOOO0);
                        case 4:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$21(oooOOO0);
                        case 5:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$22(oooOOO0);
                        case 6:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$23(oooOOO0);
                        case 7:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$24(oooOOO0);
                        case 8:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$25(oooOOO0);
                        case 9:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$26(oooOOO0);
                        case 10:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$27(oooOOO0);
                        case 11:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$10(oooOOO0);
                        case 12:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$28(oooOOO0);
                        case 13:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$29(oooOOO0);
                        case 14:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$2(oooOOO0);
                        case 15:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$30(oooOOO0);
                        case 16:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$31(oooOOO0);
                        case 17:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$3(oooOOO0);
                        case 18:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$4(oooOOO0);
                        case 19:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$5(oooOOO0);
                        case 20:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$6(oooOOO0);
                        case 21:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$7(oooOOO0);
                        case 22:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$11(oooOOO0);
                        case 23:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$8(oooOOO0);
                        case 24:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$9(oooOOO0);
                        case 25:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$12(oooOOO0);
                        case 26:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$13(oooOOO0);
                        case 27:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$14(oooOOO0);
                        case 28:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$15(oooOOO0);
                        default:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$16(oooOOO0);
                    }
                }
            });
        } else if (obj instanceof ClientCertRequest) {
            final int i21 = 5;
            this.registrar.getPigeonApiClientCertRequest().pigeon_newInstance((ClientCertRequest) obj, new o00O0Oo.Oooo000() { // from class: io.flutter.plugins.webviewflutter.OooO
                @Override // o00O0Oo.Oooo000
                public final Object invoke(Object obj2) {
                    oo00o.OooOOO0 oooOOO0 = (oo00o.OooOOO0) obj2;
                    switch (i21) {
                        case 0:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$0(oooOOO0);
                        case 1:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$19(oooOOO0);
                        case 2:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$1(oooOOO0);
                        case 3:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$20(oooOOO0);
                        case 4:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$21(oooOOO0);
                        case 5:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$22(oooOOO0);
                        case 6:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$23(oooOOO0);
                        case 7:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$24(oooOOO0);
                        case 8:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$25(oooOOO0);
                        case 9:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$26(oooOOO0);
                        case 10:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$27(oooOOO0);
                        case 11:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$10(oooOOO0);
                        case 12:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$28(oooOOO0);
                        case 13:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$29(oooOOO0);
                        case 14:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$2(oooOOO0);
                        case 15:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$30(oooOOO0);
                        case 16:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$31(oooOOO0);
                        case 17:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$3(oooOOO0);
                        case 18:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$4(oooOOO0);
                        case 19:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$5(oooOOO0);
                        case 20:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$6(oooOOO0);
                        case 21:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$7(oooOOO0);
                        case 22:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$11(oooOOO0);
                        case 23:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$8(oooOOO0);
                        case 24:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$9(oooOOO0);
                        case 25:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$12(oooOOO0);
                        case 26:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$13(oooOOO0);
                        case 27:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$14(oooOOO0);
                        case 28:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$15(oooOOO0);
                        default:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$16(oooOOO0);
                    }
                }
            });
        } else if (obj instanceof PrivateKey) {
            final int i22 = 6;
            this.registrar.getPigeonApiPrivateKey().pigeon_newInstance((PrivateKey) obj, new o00O0Oo.Oooo000() { // from class: io.flutter.plugins.webviewflutter.OooO
                @Override // o00O0Oo.Oooo000
                public final Object invoke(Object obj2) {
                    oo00o.OooOOO0 oooOOO0 = (oo00o.OooOOO0) obj2;
                    switch (i22) {
                        case 0:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$0(oooOOO0);
                        case 1:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$19(oooOOO0);
                        case 2:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$1(oooOOO0);
                        case 3:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$20(oooOOO0);
                        case 4:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$21(oooOOO0);
                        case 5:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$22(oooOOO0);
                        case 6:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$23(oooOOO0);
                        case 7:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$24(oooOOO0);
                        case 8:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$25(oooOOO0);
                        case 9:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$26(oooOOO0);
                        case 10:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$27(oooOOO0);
                        case 11:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$10(oooOOO0);
                        case 12:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$28(oooOOO0);
                        case 13:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$29(oooOOO0);
                        case 14:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$2(oooOOO0);
                        case 15:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$30(oooOOO0);
                        case 16:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$31(oooOOO0);
                        case 17:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$3(oooOOO0);
                        case 18:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$4(oooOOO0);
                        case 19:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$5(oooOOO0);
                        case 20:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$6(oooOOO0);
                        case 21:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$7(oooOOO0);
                        case 22:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$11(oooOOO0);
                        case 23:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$8(oooOOO0);
                        case 24:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$9(oooOOO0);
                        case 25:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$12(oooOOO0);
                        case 26:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$13(oooOOO0);
                        case 27:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$14(oooOOO0);
                        case 28:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$15(oooOOO0);
                        default:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$16(oooOOO0);
                    }
                }
            });
        } else if (obj instanceof X509Certificate) {
            final int i23 = 7;
            this.registrar.getPigeonApiX509Certificate().pigeon_newInstance((X509Certificate) obj, new o00O0Oo.Oooo000() { // from class: io.flutter.plugins.webviewflutter.OooO
                @Override // o00O0Oo.Oooo000
                public final Object invoke(Object obj2) {
                    oo00o.OooOOO0 oooOOO0 = (oo00o.OooOOO0) obj2;
                    switch (i23) {
                        case 0:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$0(oooOOO0);
                        case 1:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$19(oooOOO0);
                        case 2:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$1(oooOOO0);
                        case 3:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$20(oooOOO0);
                        case 4:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$21(oooOOO0);
                        case 5:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$22(oooOOO0);
                        case 6:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$23(oooOOO0);
                        case 7:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$24(oooOOO0);
                        case 8:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$25(oooOOO0);
                        case 9:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$26(oooOOO0);
                        case 10:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$27(oooOOO0);
                        case 11:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$10(oooOOO0);
                        case 12:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$28(oooOOO0);
                        case 13:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$29(oooOOO0);
                        case 14:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$2(oooOOO0);
                        case 15:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$30(oooOOO0);
                        case 16:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$31(oooOOO0);
                        case 17:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$3(oooOOO0);
                        case 18:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$4(oooOOO0);
                        case 19:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$5(oooOOO0);
                        case 20:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$6(oooOOO0);
                        case 21:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$7(oooOOO0);
                        case 22:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$11(oooOOO0);
                        case 23:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$8(oooOOO0);
                        case 24:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$9(oooOOO0);
                        case 25:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$12(oooOOO0);
                        case 26:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$13(oooOOO0);
                        case 27:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$14(oooOOO0);
                        case 28:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$15(oooOOO0);
                        default:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$16(oooOOO0);
                    }
                }
            });
        } else if (obj instanceof SslErrorHandler) {
            final int i24 = 8;
            this.registrar.getPigeonApiSslErrorHandler().pigeon_newInstance((SslErrorHandler) obj, new o00O0Oo.Oooo000() { // from class: io.flutter.plugins.webviewflutter.OooO
                @Override // o00O0Oo.Oooo000
                public final Object invoke(Object obj2) {
                    oo00o.OooOOO0 oooOOO0 = (oo00o.OooOOO0) obj2;
                    switch (i24) {
                        case 0:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$0(oooOOO0);
                        case 1:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$19(oooOOO0);
                        case 2:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$1(oooOOO0);
                        case 3:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$20(oooOOO0);
                        case 4:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$21(oooOOO0);
                        case 5:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$22(oooOOO0);
                        case 6:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$23(oooOOO0);
                        case 7:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$24(oooOOO0);
                        case 8:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$25(oooOOO0);
                        case 9:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$26(oooOOO0);
                        case 10:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$27(oooOOO0);
                        case 11:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$10(oooOOO0);
                        case 12:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$28(oooOOO0);
                        case 13:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$29(oooOOO0);
                        case 14:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$2(oooOOO0);
                        case 15:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$30(oooOOO0);
                        case 16:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$31(oooOOO0);
                        case 17:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$3(oooOOO0);
                        case 18:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$4(oooOOO0);
                        case 19:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$5(oooOOO0);
                        case 20:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$6(oooOOO0);
                        case 21:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$7(oooOOO0);
                        case 22:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$11(oooOOO0);
                        case 23:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$8(oooOOO0);
                        case 24:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$9(oooOOO0);
                        case 25:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$12(oooOOO0);
                        case 26:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$13(oooOOO0);
                        case 27:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$14(oooOOO0);
                        case 28:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$15(oooOOO0);
                        default:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$16(oooOOO0);
                    }
                }
            });
        } else if (obj instanceof SslError) {
            final int i25 = 9;
            this.registrar.getPigeonApiSslError().pigeon_newInstance((SslError) obj, new o00O0Oo.Oooo000() { // from class: io.flutter.plugins.webviewflutter.OooO
                @Override // o00O0Oo.Oooo000
                public final Object invoke(Object obj2) {
                    oo00o.OooOOO0 oooOOO0 = (oo00o.OooOOO0) obj2;
                    switch (i25) {
                        case 0:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$0(oooOOO0);
                        case 1:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$19(oooOOO0);
                        case 2:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$1(oooOOO0);
                        case 3:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$20(oooOOO0);
                        case 4:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$21(oooOOO0);
                        case 5:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$22(oooOOO0);
                        case 6:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$23(oooOOO0);
                        case 7:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$24(oooOOO0);
                        case 8:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$25(oooOOO0);
                        case 9:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$26(oooOOO0);
                        case 10:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$27(oooOOO0);
                        case 11:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$10(oooOOO0);
                        case 12:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$28(oooOOO0);
                        case 13:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$29(oooOOO0);
                        case 14:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$2(oooOOO0);
                        case 15:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$30(oooOOO0);
                        case 16:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$31(oooOOO0);
                        case 17:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$3(oooOOO0);
                        case 18:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$4(oooOOO0);
                        case 19:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$5(oooOOO0);
                        case 20:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$6(oooOOO0);
                        case 21:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$7(oooOOO0);
                        case 22:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$11(oooOOO0);
                        case 23:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$8(oooOOO0);
                        case 24:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$9(oooOOO0);
                        case 25:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$12(oooOOO0);
                        case 26:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$13(oooOOO0);
                        case 27:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$14(oooOOO0);
                        case 28:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$15(oooOOO0);
                        default:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$16(oooOOO0);
                    }
                }
            });
        } else if (obj instanceof SslCertificate.DName) {
            final int i26 = 10;
            this.registrar.getPigeonApiSslCertificateDName().pigeon_newInstance((SslCertificate.DName) obj, new o00O0Oo.Oooo000() { // from class: io.flutter.plugins.webviewflutter.OooO
                @Override // o00O0Oo.Oooo000
                public final Object invoke(Object obj2) {
                    oo00o.OooOOO0 oooOOO0 = (oo00o.OooOOO0) obj2;
                    switch (i26) {
                        case 0:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$0(oooOOO0);
                        case 1:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$19(oooOOO0);
                        case 2:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$1(oooOOO0);
                        case 3:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$20(oooOOO0);
                        case 4:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$21(oooOOO0);
                        case 5:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$22(oooOOO0);
                        case 6:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$23(oooOOO0);
                        case 7:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$24(oooOOO0);
                        case 8:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$25(oooOOO0);
                        case 9:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$26(oooOOO0);
                        case 10:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$27(oooOOO0);
                        case 11:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$10(oooOOO0);
                        case 12:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$28(oooOOO0);
                        case 13:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$29(oooOOO0);
                        case 14:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$2(oooOOO0);
                        case 15:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$30(oooOOO0);
                        case 16:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$31(oooOOO0);
                        case 17:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$3(oooOOO0);
                        case 18:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$4(oooOOO0);
                        case 19:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$5(oooOOO0);
                        case 20:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$6(oooOOO0);
                        case 21:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$7(oooOOO0);
                        case 22:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$11(oooOOO0);
                        case 23:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$8(oooOOO0);
                        case 24:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$9(oooOOO0);
                        case 25:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$12(oooOOO0);
                        case 26:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$13(oooOOO0);
                        case 27:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$14(oooOOO0);
                        case 28:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$15(oooOOO0);
                        default:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$16(oooOOO0);
                    }
                }
            });
        } else if (obj instanceof SslCertificate) {
            final int i27 = 12;
            this.registrar.getPigeonApiSslCertificate().pigeon_newInstance((SslCertificate) obj, new o00O0Oo.Oooo000() { // from class: io.flutter.plugins.webviewflutter.OooO
                @Override // o00O0Oo.Oooo000
                public final Object invoke(Object obj2) {
                    oo00o.OooOOO0 oooOOO0 = (oo00o.OooOOO0) obj2;
                    switch (i27) {
                        case 0:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$0(oooOOO0);
                        case 1:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$19(oooOOO0);
                        case 2:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$1(oooOOO0);
                        case 3:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$20(oooOOO0);
                        case 4:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$21(oooOOO0);
                        case 5:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$22(oooOOO0);
                        case 6:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$23(oooOOO0);
                        case 7:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$24(oooOOO0);
                        case 8:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$25(oooOOO0);
                        case 9:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$26(oooOOO0);
                        case 10:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$27(oooOOO0);
                        case 11:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$10(oooOOO0);
                        case 12:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$28(oooOOO0);
                        case 13:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$29(oooOOO0);
                        case 14:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$2(oooOOO0);
                        case 15:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$30(oooOOO0);
                        case 16:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$31(oooOOO0);
                        case 17:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$3(oooOOO0);
                        case 18:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$4(oooOOO0);
                        case 19:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$5(oooOOO0);
                        case 20:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$6(oooOOO0);
                        case 21:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$7(oooOOO0);
                        case 22:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$11(oooOOO0);
                        case 23:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$8(oooOOO0);
                        case 24:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$9(oooOOO0);
                        case 25:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$12(oooOOO0);
                        case 26:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$13(oooOOO0);
                        case 27:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$14(oooOOO0);
                        case 28:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$15(oooOOO0);
                        default:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$16(oooOOO0);
                    }
                }
            });
        } else if (obj instanceof Certificate) {
            final int i28 = 13;
            this.registrar.getPigeonApiCertificate().pigeon_newInstance((Certificate) obj, new o00O0Oo.Oooo000() { // from class: io.flutter.plugins.webviewflutter.OooO
                @Override // o00O0Oo.Oooo000
                public final Object invoke(Object obj2) {
                    oo00o.OooOOO0 oooOOO0 = (oo00o.OooOOO0) obj2;
                    switch (i28) {
                        case 0:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$0(oooOOO0);
                        case 1:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$19(oooOOO0);
                        case 2:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$1(oooOOO0);
                        case 3:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$20(oooOOO0);
                        case 4:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$21(oooOOO0);
                        case 5:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$22(oooOOO0);
                        case 6:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$23(oooOOO0);
                        case 7:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$24(oooOOO0);
                        case 8:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$25(oooOOO0);
                        case 9:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$26(oooOOO0);
                        case 10:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$27(oooOOO0);
                        case 11:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$10(oooOOO0);
                        case 12:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$28(oooOOO0);
                        case 13:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$29(oooOOO0);
                        case 14:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$2(oooOOO0);
                        case 15:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$30(oooOOO0);
                        case 16:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$31(oooOOO0);
                        case 17:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$3(oooOOO0);
                        case 18:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$4(oooOOO0);
                        case 19:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$5(oooOOO0);
                        case 20:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$6(oooOOO0);
                        case 21:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$7(oooOOO0);
                        case 22:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$11(oooOOO0);
                        case 23:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$8(oooOOO0);
                        case 24:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$9(oooOOO0);
                        case 25:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$12(oooOOO0);
                        case 26:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$13(oooOOO0);
                        case 27:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$14(oooOOO0);
                        case 28:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$15(oooOOO0);
                        default:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$16(oooOOO0);
                    }
                }
            });
        } else if (obj instanceof WebSettingsCompat) {
            final int i29 = 15;
            this.registrar.getPigeonApiWebSettingsCompat().pigeon_newInstance((WebSettingsCompat) obj, new o00O0Oo.Oooo000() { // from class: io.flutter.plugins.webviewflutter.OooO
                @Override // o00O0Oo.Oooo000
                public final Object invoke(Object obj2) {
                    oo00o.OooOOO0 oooOOO0 = (oo00o.OooOOO0) obj2;
                    switch (i29) {
                        case 0:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$0(oooOOO0);
                        case 1:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$19(oooOOO0);
                        case 2:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$1(oooOOO0);
                        case 3:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$20(oooOOO0);
                        case 4:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$21(oooOOO0);
                        case 5:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$22(oooOOO0);
                        case 6:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$23(oooOOO0);
                        case 7:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$24(oooOOO0);
                        case 8:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$25(oooOOO0);
                        case 9:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$26(oooOOO0);
                        case 10:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$27(oooOOO0);
                        case 11:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$10(oooOOO0);
                        case 12:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$28(oooOOO0);
                        case 13:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$29(oooOOO0);
                        case 14:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$2(oooOOO0);
                        case 15:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$30(oooOOO0);
                        case 16:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$31(oooOOO0);
                        case 17:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$3(oooOOO0);
                        case 18:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$4(oooOOO0);
                        case 19:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$5(oooOOO0);
                        case 20:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$6(oooOOO0);
                        case 21:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$7(oooOOO0);
                        case 22:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$11(oooOOO0);
                        case 23:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$8(oooOOO0);
                        case 24:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$9(oooOOO0);
                        case 25:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$12(oooOOO0);
                        case 26:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$13(oooOOO0);
                        case 27:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$14(oooOOO0);
                        case 28:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$15(oooOOO0);
                        default:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$16(oooOOO0);
                    }
                }
            });
        } else if (obj instanceof WebViewFeature) {
            final int i30 = 16;
            this.registrar.getPigeonApiWebViewFeature().pigeon_newInstance((WebViewFeature) obj, new o00O0Oo.Oooo000() { // from class: io.flutter.plugins.webviewflutter.OooO
                @Override // o00O0Oo.Oooo000
                public final Object invoke(Object obj2) {
                    oo00o.OooOOO0 oooOOO0 = (oo00o.OooOOO0) obj2;
                    switch (i30) {
                        case 0:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$0(oooOOO0);
                        case 1:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$19(oooOOO0);
                        case 2:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$1(oooOOO0);
                        case 3:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$20(oooOOO0);
                        case 4:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$21(oooOOO0);
                        case 5:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$22(oooOOO0);
                        case 6:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$23(oooOOO0);
                        case 7:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$24(oooOOO0);
                        case 8:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$25(oooOOO0);
                        case 9:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$26(oooOOO0);
                        case 10:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$27(oooOOO0);
                        case 11:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$10(oooOOO0);
                        case 12:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$28(oooOOO0);
                        case 13:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$29(oooOOO0);
                        case 14:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$2(oooOOO0);
                        case 15:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$30(oooOOO0);
                        case 16:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$31(oooOOO0);
                        case 17:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$3(oooOOO0);
                        case 18:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$4(oooOOO0);
                        case 19:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$5(oooOOO0);
                        case 20:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$6(oooOOO0);
                        case 21:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$7(oooOOO0);
                        case 22:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$11(oooOOO0);
                        case 23:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$8(oooOOO0);
                        case 24:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$9(oooOOO0);
                        case 25:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$12(oooOOO0);
                        case 26:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$13(oooOOO0);
                        case 27:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$14(oooOOO0);
                        case 28:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$15(oooOOO0);
                        default:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$16(oooOOO0);
                    }
                }
            });
        }
        if (this.registrar.getInstanceManager().containsInstance(obj)) {
            stream.write(128);
            writeValue(stream, this.registrar.getInstanceManager().getIdentifierForStrongReference(obj));
            return;
        }
        throw new IllegalArgumentException("Unsupported value: '" + obj + "' of type '" + obj.getClass().getName() + "'");
    }
}

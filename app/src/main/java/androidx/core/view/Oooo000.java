package androidx.core.view;

import android.media.MediaCodecInfo;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.contentcapture.ContentCaptureSession;
import android.webkit.WebViewRenderProcess;
import io.flutter.plugin.platform.PlatformPlugin;
import java.util.Map;

/* loaded from: classes.dex */
public abstract /* synthetic */ class Oooo000 {
    public static /* synthetic */ MediaCodecInfo.VideoCapabilities.PerformancePoint OooO0OO() {
        return new MediaCodecInfo.VideoCapabilities.PerformancePoint(PlatformPlugin.DEFAULT_SYSTEM_UI, 720, 60);
    }

    public static /* synthetic */ MediaCodecInfo.VideoCapabilities.PerformancePoint OooO0Oo(int i, int i2, int i3) {
        return new MediaCodecInfo.VideoCapabilities.PerformancePoint(i, i2, i3);
    }

    public static /* bridge */ /* synthetic */ MediaCodecInfo.VideoCapabilities.PerformancePoint OooO0o0(Object obj) {
        return (MediaCodecInfo.VideoCapabilities.PerformancePoint) obj;
    }

    public static /* synthetic */ WindowInsets.Builder OooO0oO() {
        return new WindowInsets.Builder();
    }

    public static /* synthetic */ WindowInsets.Builder OooO0oo(WindowInsets windowInsets) {
        return new WindowInsets.Builder(windowInsets);
    }

    public static /* synthetic */ AccessibilityNodeInfo.TouchDelegateInfo OooOO0(Map map) {
        return new AccessibilityNodeInfo.TouchDelegateInfo(map);
    }

    public static /* bridge */ /* synthetic */ ContentCaptureSession OooOO0o(Object obj) {
        return (ContentCaptureSession) obj;
    }

    public static /* bridge */ /* synthetic */ WebViewRenderProcess OooOOO0(Object obj) {
        return (WebViewRenderProcess) obj;
    }

    public static /* synthetic */ void OooOOOO() {
    }

    public static /* synthetic */ void OooOo() {
    }
}

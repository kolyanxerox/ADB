package OooOO0;

import android.content.ClipData;
import android.content.pm.ApkChecksum;
import android.media.metrics.MediaMetricsManager;
import android.os.VibratorManager;
import android.p001os.OutcomeReceiver;
import android.view.ContentInfo;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class OooO0O0 {
    public static /* bridge */ /* synthetic */ ApkChecksum OooO0o0(Object obj) {
        return (ApkChecksum) obj;
    }

    public static /* bridge */ /* synthetic */ MediaMetricsManager OooO0oO(Object obj) {
        return (MediaMetricsManager) obj;
    }

    public static /* bridge */ /* synthetic */ OutcomeReceiver OooOOO0(Object obj) {
        return (OutcomeReceiver) obj;
    }

    public static /* bridge */ /* synthetic */ VibratorManager OooOOOO(Object obj) {
        return (VibratorManager) obj;
    }

    public static /* synthetic */ ContentInfo.Builder OooOOOo(ClipData clipData, int i) {
        return new ContentInfo.Builder(clipData, i);
    }

    public static /* synthetic */ ContentInfo.Builder OooOOo0(ContentInfo contentInfo) {
        return new ContentInfo.Builder(contentInfo);
    }

    public static /* bridge */ /* synthetic */ ContentInfo OooOOoo(Object obj) {
        return (ContentInfo) obj;
    }

    public static /* synthetic */ void OooOo00() {
    }
}

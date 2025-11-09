package android.support.customtabs;

import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import java.util.List;

/* loaded from: classes.dex */
public interface OooOO0 extends IInterface {

    /* renamed from: OooO0OO, reason: collision with root package name */
    public static final String f15150OooO0OO = "android$support$customtabs$ICustomTabsService".replace('$', '.');

    Bundle extraCommand(String str, Bundle bundle);

    boolean isEngagementSignalsApiAvailable(OooO0OO oooO0OO, Bundle bundle);

    boolean mayLaunchUrl(OooO0OO oooO0OO, Uri uri, Bundle bundle, List list);

    boolean newSession(OooO0OO oooO0OO);

    boolean newSessionWithExtras(OooO0OO oooO0OO, Bundle bundle);

    int postMessage(OooO0OO oooO0OO, String str, Bundle bundle);

    boolean receiveFile(OooO0OO oooO0OO, Uri uri, int i, Bundle bundle);

    boolean requestPostMessageChannel(OooO0OO oooO0OO, Uri uri);

    boolean requestPostMessageChannelWithExtras(OooO0OO oooO0OO, Uri uri, Bundle bundle);

    boolean setEngagementSignalsCallback(OooO0OO oooO0OO, IBinder iBinder, Bundle bundle);

    boolean updateVisuals(OooO0OO oooO0OO, Bundle bundle);

    boolean validateRelationship(OooO0OO oooO0OO, int i, Uri uri, Bundle bundle);

    boolean warmup(long j);
}

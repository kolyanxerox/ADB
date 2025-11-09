package android.support.v4.app;

import android.app.Notification;
import android.os.IInterface;

/* loaded from: classes.dex */
public interface OooO0OO extends IInterface {

    /* renamed from: OooO0oo, reason: collision with root package name */
    public static final String f15160OooO0oo = "android$support$v4$app$INotificationSideChannel".replace('$', '.');

    void cancel(String str, int i, String str2);

    void cancelAll(String str);

    void notify(String str, int i, String str2, Notification notification);
}

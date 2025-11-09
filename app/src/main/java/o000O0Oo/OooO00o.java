package o000O0Oo;

import androidx.core.app.NotificationCompat;
import java.io.File;
import java.io.FilenameFilter;

/* loaded from: classes2.dex */
public final /* synthetic */ class OooO00o implements FilenameFilter {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f30125OooO00o;

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        switch (this.f30125OooO00o) {
            case 0:
                return str.startsWith(NotificationCompat.CATEGORY_EVENT);
            case 1:
                return str.startsWith(NotificationCompat.CATEGORY_EVENT) && !str.endsWith("_");
            case 2:
                return str.startsWith("aqs.");
            default:
                return str.startsWith(".ae");
        }
    }
}

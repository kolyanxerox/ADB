package androidx.work.impl.utils;

import OooO0oO.OooOo;
import android.content.ComponentName;
import android.content.Context;
import androidx.work.Logger;
import com.ironsource.C3824x4;
import org.apache.tika.utils.StringUtils;

/* loaded from: classes.dex */
public class PackageManagerHelper {
    private static final String TAG = Logger.tagWithPrefix("PackageManagerHelper");

    private PackageManagerHelper() {
    }

    public static boolean isComponentExplicitlyEnabled(Context context, Class<?> cls) {
        return isComponentExplicitlyEnabled(context, cls.getName());
    }

    public static void setComponentEnabled(Context context, Class<?> cls, boolean z) {
        String str = C3824x4.f12570e;
        try {
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), z ? 1 : 2, 1);
            Logger.get().debug(TAG, cls.getName() + StringUtils.SPACE + (z ? "enabled" : C3824x4.f12570e), new Throwable[0]);
        } catch (Exception e) {
            Logger logger = Logger.get();
            String str2 = TAG;
            String name = cls.getName();
            if (z) {
                str = "enabled";
            }
            logger.debug(str2, OooOo.OooOoo(name, " could not be ", str), e);
        }
    }

    public static boolean isComponentExplicitlyEnabled(Context context, String str) {
        return context.getPackageManager().getComponentEnabledSetting(new ComponentName(context, str)) == 1;
    }
}

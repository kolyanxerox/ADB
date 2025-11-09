package androidx.window.area.utils;

import android.util.DisplayMetrics;
import com.google.android.gms.internal.measurement.o0OO0O0;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.OooOo;

/* loaded from: classes.dex */
public final class DeviceUtils {
    public static final DeviceUtils INSTANCE = new DeviceUtils();
    private static final List<DeviceMetrics> deviceList;

    static {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        displayMetrics.widthPixels = 1080;
        displayMetrics.heightPixels = 2092;
        displayMetrics.density = 2.625f;
        displayMetrics.densityDpi = 420;
        deviceList = o0OO0O0.OooOO0o(new DeviceMetrics(AndroidStaticDeviceInfoDataSource.STORE_GOOGLE, "pixel fold", displayMetrics));
    }

    private DeviceUtils() {
    }

    public final DisplayMetrics getRearDisplayMetrics$window_release(String manufacturer, String model) {
        Object next;
        OooOo.OooO0o0(manufacturer, "manufacturer");
        OooOo.OooO0o0(model, "model");
        Iterator<T> it = deviceList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            DeviceMetrics deviceMetrics = (DeviceMetrics) next;
            String manufacturer2 = deviceMetrics.getManufacturer();
            Locale US = Locale.US;
            OooOo.OooO0Oo(US, "US");
            String lowerCase = manufacturer.toLowerCase(US);
            OooOo.OooO0Oo(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (OooOo.OooO00o(manufacturer2, lowerCase)) {
                String model2 = deviceMetrics.getModel();
                OooOo.OooO0Oo(US, "US");
                String lowerCase2 = model.toLowerCase(US);
                OooOo.OooO0Oo(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
                if (OooOo.OooO00o(model2, lowerCase2)) {
                    break;
                }
            }
        }
        DeviceMetrics deviceMetrics2 = (DeviceMetrics) next;
        if (deviceMetrics2 != null) {
            return deviceMetrics2.getRearDisplayMetrics();
        }
        return null;
    }

    public final boolean hasDeviceMetrics$window_release(String manufacturer, String model) {
        OooOo.OooO0o0(manufacturer, "manufacturer");
        OooOo.OooO0o0(model, "model");
        List<DeviceMetrics> list = deviceList;
        if (list != null && list.isEmpty()) {
            return false;
        }
        for (DeviceMetrics deviceMetrics : list) {
            String manufacturer2 = deviceMetrics.getManufacturer();
            Locale US = Locale.US;
            OooOo.OooO0Oo(US, "US");
            String lowerCase = manufacturer.toLowerCase(US);
            OooOo.OooO0Oo(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (OooOo.OooO00o(manufacturer2, lowerCase)) {
                String model2 = deviceMetrics.getModel();
                OooOo.OooO0Oo(US, "US");
                String lowerCase2 = model.toLowerCase(US);
                OooOo.OooO0Oo(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
                if (OooOo.OooO00o(model2, lowerCase2)) {
                    return true;
                }
            }
        }
        return false;
    }
}

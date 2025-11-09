package androidx.window.area.utils;

import android.util.DisplayMetrics;
import androidx.datastore.preferences.protobuf.OooO00o;
import kotlin.jvm.internal.OooOo;

/* loaded from: classes.dex */
public final class DeviceMetrics {
    private final String manufacturer;
    private final String model;
    private final DisplayMetrics rearDisplayMetrics;

    public DeviceMetrics(String manufacturer, String model, DisplayMetrics rearDisplayMetrics) {
        OooOo.OooO0o0(manufacturer, "manufacturer");
        OooOo.OooO0o0(model, "model");
        OooOo.OooO0o0(rearDisplayMetrics, "rearDisplayMetrics");
        this.manufacturer = manufacturer;
        this.model = model;
        this.rearDisplayMetrics = rearDisplayMetrics;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof DeviceMetrics)) {
            return false;
        }
        DeviceMetrics deviceMetrics = (DeviceMetrics) obj;
        return OooOo.OooO00o(this.manufacturer, deviceMetrics.manufacturer) && OooOo.OooO00o(this.model, deviceMetrics.model) && this.rearDisplayMetrics.equals(deviceMetrics.rearDisplayMetrics);
    }

    public final String getManufacturer() {
        return this.manufacturer;
    }

    public final String getModel() {
        return this.model;
    }

    public final DisplayMetrics getRearDisplayMetrics() {
        return this.rearDisplayMetrics;
    }

    public int hashCode() {
        return this.rearDisplayMetrics.hashCode() + OooO00o.OooO0O0(this.manufacturer.hashCode() * 31, 31, this.model);
    }

    public String toString() {
        return "DeviceMetrics{ Manufacturer: " + this.manufacturer + ", model: " + this.model + ", Rear display metrics: " + this.rearDisplayMetrics + " }";
    }
}

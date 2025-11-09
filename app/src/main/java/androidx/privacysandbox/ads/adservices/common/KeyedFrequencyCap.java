package androidx.privacysandbox.ads.adservices.common;

import androidx.privacysandbox.ads.adservices.adselection.OooO00o;
import androidx.privacysandbox.ads.adservices.common.ExperimentalFeatures;
import java.time.Duration;
import kotlin.jvm.internal.OooOo;

@ExperimentalFeatures.Ext8OptIn
/* loaded from: classes.dex */
public final class KeyedFrequencyCap {
    private final int adCounterKey;
    private final Duration interval;
    private final int maxCount;

    public KeyedFrequencyCap(int i, int i2, Duration interval) {
        OooOo.OooO0o0(interval, "interval");
        this.adCounterKey = i;
        this.maxCount = i2;
        this.interval = interval;
    }

    public final android.adservices.common.KeyedFrequencyCap convertToAdServices$ads_adservices_release() {
        OooO00o.OooOoo();
        android.adservices.common.KeyedFrequencyCap keyedFrequencyCapBuild = OooO00o.OooOo00(this.adCounterKey, this.maxCount, this.interval).build();
        OooOo.OooO0Oo(keyedFrequencyCapBuild, "Builder(adCounterKey, ma…val)\n            .build()");
        return keyedFrequencyCapBuild;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KeyedFrequencyCap)) {
            return false;
        }
        KeyedFrequencyCap keyedFrequencyCap = (KeyedFrequencyCap) obj;
        return this.adCounterKey == keyedFrequencyCap.adCounterKey && this.maxCount == keyedFrequencyCap.maxCount && OooOo.OooO00o(this.interval, keyedFrequencyCap.interval);
    }

    public final int getAdCounterKey() {
        return this.adCounterKey;
    }

    public final Duration getInterval() {
        return this.interval;
    }

    public final int getMaxCount() {
        return this.maxCount;
    }

    public int hashCode() {
        return this.interval.hashCode() + androidx.datastore.preferences.protobuf.OooO00o.OooO00o(this.maxCount, Integer.hashCode(this.adCounterKey) * 31, 31);
    }

    public String toString() {
        return "KeyedFrequencyCap: adCounterKey=" + this.adCounterKey + ", maxCount=" + this.maxCount + ", interval=" + this.interval;
    }
}

package androidx.work.impl.model;

import androidx.lifecycle.LiveData;

/* loaded from: classes.dex */
public interface PreferenceDao {
    Long getLongValue(String str);

    LiveData<Long> getObservableLongValue(String str);

    void insertPreference(Preference preference);
}

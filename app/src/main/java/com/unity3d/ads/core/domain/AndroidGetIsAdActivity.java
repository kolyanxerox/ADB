package com.unity3d.ads.core.domain;

import com.google.android.gms.internal.measurement.o0OOO0;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.extensions.StringExtensionsKt;
import java.util.List;
import kotlin.jvm.internal.OooOo;
import o00OOOoO.o0000O0;
import oo00o.OooO0OO;

/* loaded from: classes3.dex */
public final class AndroidGetIsAdActivity {
    private final OooO0OO activities$delegate;
    private final SessionRepository sessionRepository;

    public AndroidGetIsAdActivity(SessionRepository sessionRepository) {
        OooOo.OooO0o0(sessionRepository, "sessionRepository");
        this.sessionRepository = sessionRepository;
        this.activities$delegate = o0OOO0.OooO0oo(new AndroidGetIsAdActivity$activities$2(this));
    }

    private final List<o0000O0> getActivities() {
        return (List) this.activities$delegate.getValue();
    }

    public final boolean invoke(String activityName) {
        OooOo.OooO0o0(activityName, "activityName");
        return getActivities().contains(o0000O0.OooO0O0(StringExtensionsKt.getSHA256Hash(activityName)));
    }
}

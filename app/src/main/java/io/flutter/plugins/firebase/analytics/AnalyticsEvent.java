package io.flutter.plugins.firebase.analytics;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.OooOO0O;
import kotlin.jvm.internal.OooOo;

/* loaded from: classes3.dex */
public final class AnalyticsEvent {
    public static final Companion Companion = new Companion(null);
    private final String name;
    private final Map<String, Object> parameters;

    public static final class Companion {
        public /* synthetic */ Companion(OooOO0O oooOO0O) {
            this();
        }

        public final AnalyticsEvent fromList(List<? extends Object> pigeonVar_list) {
            OooOo.OooO0o0(pigeonVar_list, "pigeonVar_list");
            Object obj = pigeonVar_list.get(0);
            OooOo.OooO0OO(obj, "null cannot be cast to non-null type kotlin.String");
            return new AnalyticsEvent((String) obj, (Map) pigeonVar_list.get(1));
        }

        private Companion() {
        }
    }

    public AnalyticsEvent(String name, Map<String, ? extends Object> map) {
        OooOo.OooO0o0(name, "name");
        this.name = name;
        this.parameters = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AnalyticsEvent copy$default(AnalyticsEvent analyticsEvent, String str, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = analyticsEvent.name;
        }
        if ((i & 2) != 0) {
            map = analyticsEvent.parameters;
        }
        return analyticsEvent.copy(str, map);
    }

    public final String component1() {
        return this.name;
    }

    public final Map<String, Object> component2() {
        return this.parameters;
    }

    public final AnalyticsEvent copy(String name, Map<String, ? extends Object> map) {
        OooOo.OooO0o0(name, "name");
        return new AnalyticsEvent(name, map);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AnalyticsEvent)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return GeneratedAndroidFirebaseAnalyticsPigeonUtils.INSTANCE.deepEquals(toList(), ((AnalyticsEvent) obj).toList());
    }

    public final String getName() {
        return this.name;
    }

    public final Map<String, Object> getParameters() {
        return this.parameters;
    }

    public int hashCode() {
        return toList().hashCode();
    }

    public final List<Object> toList() {
        return o00O0.OooOo.OooOOo(this.name, this.parameters);
    }

    public String toString() {
        return "AnalyticsEvent(name=" + this.name + ", parameters=" + this.parameters + ")";
    }

    public /* synthetic */ AnalyticsEvent(String str, Map map, int i, OooOO0O oooOO0O) {
        this(str, (i & 2) != 0 ? null : map);
    }
}

package com.unity3d.ads.core.domain;

import android.app.Activity;
import androidx.annotation.VisibleForTesting;
import com.unity3d.ads.core.data.repository.FocusRepository;
import com.unity3d.ads.core.data.repository.FocusState;
import com.unity3d.ads.core.data.repository.SessionRepository;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o0OO00O;
import o00O0.o000OOo;
import o00O0O0O.OooO0OO;
import o00O0O0o.OooOo00;
import o00O0OO0.OooO;
import o00O0OO0.OooOOOO;
import o00O0Oo.o00O0O;
import o00O0oOO.OooOO0O;
import o00O0oOO.OooOo;
import o00O0oOO.Oooo0;
import o00O0oOO.Oooo000;
import o00O0oOo.o0000O00;
import o00O0oOo.o0000OO0;
import o00O0ooo.o0O0OOO0;
import o00O0ooo.o0OO;
import o00O0ooo.o0o0000;
import o00O0ooo.oO00000o;

/* loaded from: classes3.dex */
public final class AndroidHandleFocusCounters {
    private final o0000O00 defaultDispatcher;
    private final FocusRepository focusRepository;
    private final ConcurrentHashMap<String, OooOo> focusTimesPerActivity;
    private final AndroidGetIsAdActivity isAdActivity;
    private volatile String latestKnownActivityResumed;
    private final o0OO previousFocusState;
    private final SessionRepository sessionRepository;
    private final Oooo0 timeSource;

    @OooO(m13471c = "com.unity3d.ads.core.domain.AndroidHandleFocusCounters$invoke$1", m13472f = "AndroidHandleFocusCounters.kt", m13473l = {}, m13474m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.core.domain.AndroidHandleFocusCounters$invoke$1 */
    public static final class C40731 extends OooOOOO implements o00O0O {
        /* synthetic */ Object L$0;
        int label;

        public C40731(OooO0OO oooO0OO) {
            super(2, oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final OooO0OO create(Object obj, OooO0OO oooO0OO) {
            C40731 c40731 = AndroidHandleFocusCounters.this.new C40731(oooO0OO);
            c40731.L$0 = obj;
            return c40731;
        }

        @Override // o00O0Oo.o00O0O
        public final Object invoke(FocusState focusState, OooO0OO oooO0OO) {
            return ((C40731) create(focusState, oooO0OO)).invokeSuspend(oo00o.OooOo.f33195OooO00o);
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            String strOooO0O0;
            OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o000OOo.OooOO0O(obj);
            FocusState focusState = (FocusState) this.L$0;
            AndroidHandleFocusCounters.this.onFocusStateChange(focusState);
            Activity activity = focusState.getActivity().get();
            if (activity == null || (strOooO0O0 = o0OO00O.OooO00o(activity.getClass()).OooO0O0()) == null) {
                strOooO0O0 = "unknown_activity_name";
            }
            boolean zInvoke = AndroidHandleFocusCounters.this.isAdActivity.invoke(strOooO0O0);
            oo00o.OooOo oooOo = oo00o.OooOo.f33195OooO00o;
            if (zInvoke) {
                AndroidHandleFocusCounters.this.sessionRepository.incrementGlobalAdsFocusChangeCount();
                if (focusState instanceof FocusState.Focused) {
                    AndroidHandleFocusCounters.this.onResume(strOooO0O0);
                    return oooOo;
                }
                if (focusState instanceof FocusState.Unfocused) {
                    AndroidHandleFocusCounters.this.onPause(strOooO0O0);
                }
            }
            return oooOo;
        }
    }

    public AndroidHandleFocusCounters(SessionRepository sessionRepository, FocusRepository focusRepository, AndroidGetIsAdActivity isAdActivity, o0000O00 defaultDispatcher, Oooo0 timeSource) {
        kotlin.jvm.internal.OooOo.OooO0o0(sessionRepository, "sessionRepository");
        kotlin.jvm.internal.OooOo.OooO0o0(focusRepository, "focusRepository");
        kotlin.jvm.internal.OooOo.OooO0o0(isAdActivity, "isAdActivity");
        kotlin.jvm.internal.OooOo.OooO0o0(defaultDispatcher, "defaultDispatcher");
        kotlin.jvm.internal.OooOo.OooO0o0(timeSource, "timeSource");
        this.sessionRepository = sessionRepository;
        this.focusRepository = focusRepository;
        this.isAdActivity = isAdActivity;
        this.defaultDispatcher = defaultDispatcher;
        this.timeSource = timeSource;
        this.focusTimesPerActivity = new ConcurrentHashMap<>();
        this.previousFocusState = o0o0000.OooO0OO(null);
    }

    @VisibleForTesting
    public static /* synthetic */ void getLatestKnownActivityResumed$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onFocusStateChange(FocusState focusState) {
        oO00000o oo00000o;
        Object value;
        FocusState focusState2;
        o0OO o0oo = this.previousFocusState;
        do {
            oo00000o = (oO00000o) o0oo;
            value = oo00000o.getValue();
            focusState2 = (FocusState) value;
        } while (!oo00000o.OooO0oO(value, focusState));
        if (focusState2 == null || focusState.getClass() == focusState2.getClass()) {
            return;
        }
        this.sessionRepository.incrementFocusChangeCount();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onPause(String str) {
        String str2 = this.latestKnownActivityResumed;
        if (str2 == null || str2.equals(str)) {
            OooOo oooOoRemove = this.focusTimesPerActivity.remove(str);
            if (oooOoRemove == null) {
                oooOoRemove = this.timeSource.OooO00o();
            }
            this.sessionRepository.addTimeToGlobalAdsFocusTime((int) OooOO0O.OooO0Oo(OooOo.OooO00o(oooOoRemove.f31475OooOo0O)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onResume(String str) {
        this.latestKnownActivityResumed = str;
        this.focusTimesPerActivity.put(str, this.timeSource.OooO00o());
    }

    public final String getLatestKnownActivityResumed() {
        return this.latestKnownActivityResumed;
    }

    public final void invoke() {
        o0o0000.OooOOo0(new o0O0OOO0(this.focusRepository.getFocusState(), new C40731(null), 2), o0000OO0.OooO0O0(this.defaultDispatcher));
    }

    public final void setLatestKnownActivityResumed(String str) {
        this.latestKnownActivityResumed = str;
    }

    public /* synthetic */ AndroidHandleFocusCounters(SessionRepository sessionRepository, FocusRepository focusRepository, AndroidGetIsAdActivity androidGetIsAdActivity, o0000O00 o0000o00, Oooo0 oooo0, int i, kotlin.jvm.internal.OooOO0O oooOO0O) {
        this(sessionRepository, focusRepository, androidGetIsAdActivity, o0000o00, (i & 16) != 0 ? Oooo000.f31476OooO00o : oooo0);
    }
}

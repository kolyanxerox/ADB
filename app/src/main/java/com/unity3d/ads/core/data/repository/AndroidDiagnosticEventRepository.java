package com.unity3d.ads.core.data.repository;

import com.unity3d.ads.core.domain.events.GetDiagnosticEventRequest;
import com.unity3d.ads.core.utils.CoroutineTimer;
import com.unity3d.services.core.log.DeviceLog;
import gatewayprotocol.p014v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.p014v1.NativeConfigurationOuterClass;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Oooo000;
import o00O0.o000OOo;
import o00O0.oo000o;
import o00O0O0O.OooO0OO;
import o00O0O0o.OooOo00;
import o00O0OO0.OooO;
import o00O0OO0.OooOOOO;
import o00O0Oo.OooO0O0;
import o00O0Oo.o00O0O;
import o00O0Oo0.o00Oo0;
import o00O0o.o0OoOo0;
import o00O0oOo.o0000O00;
import o00O0oOo.o0000O0O;
import o00O0oOo.o0000OO0;
import o00O0oOo.o000OO;
import o00O0oo.o0000oo;
import o00O0ooo.o0OO;
import o00O0ooo.o0OO0oO0;
import o00O0ooo.o0OOO00;
import o00O0ooo.o0OOO0OO;
import o00O0ooo.o0OOo000;
import o00O0ooo.o0o0000;
import o00O0ooo.oO00000o;
import oo00o.OooOo;

/* loaded from: classes3.dex */
public final class AndroidDiagnosticEventRepository implements DiagnosticEventRepository {
    private final o0OO0oO0 _diagnosticEvents;
    private final Set<DiagnosticEventRequestOuterClass.DiagnosticEventType> allowedEvents;
    private final o0OO batch;
    private final Set<DiagnosticEventRequestOuterClass.DiagnosticEventType> blockedEvents;
    private final o0OO configured;
    private final o000OO coroutineScope;
    private final o0OOO0OO diagnosticEvents;
    private final o0OO enabled;
    private final CoroutineTimer flushTimer;
    private final GetDiagnosticEventRequest getDiagnosticEventRequest;
    private int maxBatchSize;

    /* renamed from: com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository$configure$1 */
    public static final class C40391 extends Oooo000 implements OooO0O0 {
        public C40391() {
            super(0);
        }

        @Override // o00O0Oo.OooO0O0
        public /* bridge */ /* synthetic */ Object invoke() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            m13768invoke();
            return OooOo.f33195OooO00o;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m13768invoke() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            AndroidDiagnosticEventRepository.this.flush();
        }
    }

    @OooO(m13471c = "com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository$flush$1", m13472f = "AndroidDiagnosticEventRepository.kt", m13473l = {68}, m13474m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository$flush$1 */
    public static final class C40401 extends OooOOOO implements o00O0O {
        final /* synthetic */ List<DiagnosticEventRequestOuterClass.DiagnosticEvent> $events;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40401(List<DiagnosticEventRequestOuterClass.DiagnosticEvent> list, OooO0OO oooO0OO) {
            super(2, oooO0OO);
            this.$events = list;
        }

        @Override // o00O0OO0.OooO00o
        public final OooO0OO create(Object obj, OooO0OO oooO0OO) {
            return AndroidDiagnosticEventRepository.this.new C40401(this.$events, oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
            int i = this.label;
            if (i == 0) {
                o000OOo.OooOO0O(obj);
                o0OO0oO0 o0oo0oo0 = AndroidDiagnosticEventRepository.this._diagnosticEvents;
                List<DiagnosticEventRequestOuterClass.DiagnosticEvent> list = this.$events;
                this.label = 1;
                if (o0oo0oo0.emit(list, this) == oooOo00) {
                    return oooOo00;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o000OOo.OooOO0O(obj);
            }
            return OooOo.f33195OooO00o;
        }

        @Override // o00O0Oo.o00O0O
        public final Object invoke(o000OO o000oo2, OooO0OO oooO0OO) {
            return ((C40401) create(o000oo2, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
        }
    }

    public AndroidDiagnosticEventRepository(CoroutineTimer flushTimer, GetDiagnosticEventRequest getDiagnosticEventRequest, o0000O00 dispatcher) {
        kotlin.jvm.internal.OooOo.OooO0o0(flushTimer, "flushTimer");
        kotlin.jvm.internal.OooOo.OooO0o0(getDiagnosticEventRequest, "getDiagnosticEventRequest");
        kotlin.jvm.internal.OooOo.OooO0o0(dispatcher, "dispatcher");
        this.flushTimer = flushTimer;
        this.getDiagnosticEventRequest = getDiagnosticEventRequest;
        this.coroutineScope = o0000OO0.OooOo0o(o0000OO0.OooO0O0(dispatcher), new o0000O0O("DiagnosticEventRepository"));
        this.batch = o0o0000.OooO0OO(oo000o.f31251OooOo0O);
        this.maxBatchSize = Integer.MAX_VALUE;
        this.allowedEvents = Collections.synchronizedSet(new LinkedHashSet());
        this.blockedEvents = Collections.synchronizedSet(new LinkedHashSet());
        Boolean bool = Boolean.FALSE;
        this.enabled = o0o0000.OooO0OO(bool);
        this.configured = o0o0000.OooO0OO(bool);
        o0OOo000 o0ooo000OooO00o = o0o0000.OooO00o((7 & 1) != 0 ? 0 : 100, (7 & 2) == 0 ? 64 : 0, o0000oo.f31602OooOo0O);
        this._diagnosticEvents = o0ooo000OooO00o;
        this.diagnosticEvents = new o0OOO00(o0ooo000OooO00o);
    }

    @Override // com.unity3d.ads.core.data.repository.DiagnosticEventRepository
    public void addDiagnosticEvent(DiagnosticEventRequestOuterClass.DiagnosticEvent diagnosticEvent) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        oO00000o oo00000o;
        Object value;
        oO00000o oo00000o2;
        Object value2;
        kotlin.jvm.internal.OooOo.OooO0o0(diagnosticEvent, "diagnosticEvent");
        if (!((Boolean) ((oO00000o) this.configured).getValue()).booleanValue()) {
            o0OO o0oo = this.batch;
            do {
                oo00000o2 = (oO00000o) o0oo;
                value2 = oo00000o2.getValue();
            } while (!oo00000o2.OooO0oO(value2, o00O0.OooOo00.Oooo00o((List) value2, diagnosticEvent)));
            return;
        }
        if (((Boolean) ((oO00000o) this.enabled).getValue()).booleanValue()) {
            o0OO o0oo2 = this.batch;
            do {
                oo00000o = (oO00000o) o0oo2;
                value = oo00000o.getValue();
            } while (!oo00000o.OooO0oO(value, o00O0.OooOo00.Oooo00o((List) value, diagnosticEvent)));
            if (((List) ((oO00000o) this.batch).getValue()).size() >= this.maxBatchSize) {
                flush();
            }
        }
    }

    @Override // com.unity3d.ads.core.data.repository.DiagnosticEventRepository
    public void clear() {
        oO00000o oo00000o;
        Object value;
        o0OO o0oo = this.batch;
        do {
            oo00000o = (oO00000o) o0oo;
            value = oo00000o.getValue();
        } while (!oo00000o.OooO0oO(value, oo000o.f31251OooOo0O));
    }

    @Override // com.unity3d.ads.core.data.repository.DiagnosticEventRepository
    public void configure(NativeConfigurationOuterClass.DiagnosticEventsConfiguration diagnosticsEventsConfiguration) {
        kotlin.jvm.internal.OooOo.OooO0o0(diagnosticsEventsConfiguration, "diagnosticsEventsConfiguration");
        o0OO o0oo = this.configured;
        Boolean bool = Boolean.TRUE;
        oO00000o oo00000o = (oO00000o) o0oo;
        oo00000o.getClass();
        oo00000o.OooO(null, bool);
        o0OO o0oo2 = this.enabled;
        Boolean boolValueOf = Boolean.valueOf(diagnosticsEventsConfiguration.getEnabled());
        oO00000o oo00000o2 = (oO00000o) o0oo2;
        oo00000o2.getClass();
        oo00000o2.OooO(null, boolValueOf);
        if (!((Boolean) ((oO00000o) this.enabled).getValue()).booleanValue()) {
            clear();
            return;
        }
        this.maxBatchSize = diagnosticsEventsConfiguration.getMaxBatchSize();
        Set<DiagnosticEventRequestOuterClass.DiagnosticEventType> set = this.allowedEvents;
        List<DiagnosticEventRequestOuterClass.DiagnosticEventType> allowedEventsList = diagnosticsEventsConfiguration.getAllowedEventsList();
        kotlin.jvm.internal.OooOo.OooO0Oo(allowedEventsList, "diagnosticsEventsConfiguration.allowedEventsList");
        set.addAll(allowedEventsList);
        Set<DiagnosticEventRequestOuterClass.DiagnosticEventType> set2 = this.blockedEvents;
        List<DiagnosticEventRequestOuterClass.DiagnosticEventType> blockedEventsList = diagnosticsEventsConfiguration.getBlockedEventsList();
        kotlin.jvm.internal.OooOo.OooO0Oo(blockedEventsList, "diagnosticsEventsConfiguration.blockedEventsList");
        set2.addAll(blockedEventsList);
        this.flushTimer.start(0L, diagnosticsEventsConfiguration.getMaxBatchIntervalMs(), new C40391());
    }

    @Override // com.unity3d.ads.core.data.repository.DiagnosticEventRepository
    public void flush() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        oO00000o oo00000o;
        Object value;
        if (((Boolean) ((oO00000o) this.enabled).getValue()).booleanValue()) {
            o0OO o0oo = this.batch;
            do {
                oo00000o = (oO00000o) o0oo;
                value = oo00000o.getValue();
            } while (!oo00000o.OooO0oO(value, oo000o.f31251OooOo0O));
            Iterable iterable = (Iterable) value;
            kotlin.jvm.internal.OooOo.OooO0o0(iterable, "<this>");
            List listOooo0oo = o0OoOo0.Oooo0oo(o0OoOo0.Oooo0O0(o0OoOo0.Oooo0O0(new o00Oo0(new o00O0.o00Oo0(iterable, 0), new AndroidDiagnosticEventRepository$flush$events$2(this), 4), new AndroidDiagnosticEventRepository$flush$events$3(this)), new AndroidDiagnosticEventRepository$flush$events$4(this)));
            if (listOooo0oo.isEmpty()) {
                return;
            }
            DeviceLog.debug("Unity Ads Sending diagnostic batch enabled: " + ((Boolean) ((oO00000o) this.enabled).getValue()).booleanValue() + " size: " + listOooo0oo.size() + " :: " + listOooo0oo);
            o0000OO0.OooOo0(this.coroutineScope, null, new C40401(listOooo0oo, null), 3);
        }
    }

    @Override // com.unity3d.ads.core.data.repository.DiagnosticEventRepository
    public o0OOO0OO getDiagnosticEvents() {
        return this.diagnosticEvents;
    }
}

package com.ironsource;

import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.ironsource.ug */
/* loaded from: classes2.dex */
public interface InterfaceC3733ug<T> {

    /* renamed from: com.ironsource.ug$a */
    public static final class a implements InterfaceC3733ug<ISDemandOnlyInterstitialListener> {

        /* renamed from: a */
        private C3698tg f12235a = new C3698tg();

        /* renamed from: b */
        private final Map<String, C3698tg> f12236b = new HashMap();

        @Override // com.ironsource.InterfaceC3733ug
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ISDemandOnlyInterstitialListener mo12671a(String instanceId) {
            kotlin.jvm.internal.OooOo.OooO0o0(instanceId, "instanceId");
            C3698tg c3698tg = this.f12236b.get(instanceId);
            return c3698tg != null ? c3698tg : this.f12235a;
        }

        @Override // com.ironsource.InterfaceC3733ug
        /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public void mo12672a(ISDemandOnlyInterstitialListener listener) {
            kotlin.jvm.internal.OooOo.OooO0o0(listener, "listener");
            this.f12235a.mo12778a(listener);
            Iterator<String> it = this.f12236b.keySet().iterator();
            while (it.hasNext()) {
                C3698tg c3698tg = this.f12236b.get(it.next());
                if (c3698tg != null) {
                    c3698tg.mo12778a(listener);
                }
            }
        }

        @Override // com.ironsource.InterfaceC3733ug
        /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public void mo12673a(String instanceId, ISDemandOnlyInterstitialListener listener) {
            kotlin.jvm.internal.OooOo.OooO0o0(instanceId, "instanceId");
            kotlin.jvm.internal.OooOo.OooO0o0(listener, "listener");
            if (!this.f12236b.containsKey(instanceId)) {
                this.f12236b.put(instanceId, new C3698tg(listener));
                return;
            }
            C3698tg c3698tg = this.f12236b.get(instanceId);
            if (c3698tg != null) {
                c3698tg.mo12778a(listener);
            }
        }
    }

    /* renamed from: com.ironsource.ug$b */
    public static final class b implements InterfaceC3733ug<ISDemandOnlyRewardedVideoListener> {

        /* renamed from: a */
        private C3802wg f12237a = new C3802wg();

        /* renamed from: b */
        private final Map<String, C3802wg> f12238b = new HashMap();

        @Override // com.ironsource.InterfaceC3733ug
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ISDemandOnlyRewardedVideoListener mo12671a(String instanceId) {
            kotlin.jvm.internal.OooOo.OooO0o0(instanceId, "instanceId");
            C3802wg c3802wg = this.f12238b.get(instanceId);
            return c3802wg != null ? c3802wg : this.f12237a;
        }

        @Override // com.ironsource.InterfaceC3733ug
        /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public void mo12672a(ISDemandOnlyRewardedVideoListener listener) {
            kotlin.jvm.internal.OooOo.OooO0o0(listener, "listener");
            this.f12237a.mo12778a(listener);
            Iterator<String> it = this.f12238b.keySet().iterator();
            while (it.hasNext()) {
                C3802wg c3802wg = this.f12238b.get(it.next());
                if (c3802wg != null) {
                    c3802wg.mo12778a(listener);
                }
            }
        }

        @Override // com.ironsource.InterfaceC3733ug
        /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public void mo12673a(String instanceId, ISDemandOnlyRewardedVideoListener listener) {
            kotlin.jvm.internal.OooOo.OooO0o0(instanceId, "instanceId");
            kotlin.jvm.internal.OooOo.OooO0o0(listener, "listener");
            if (!this.f12238b.containsKey(instanceId)) {
                this.f12238b.put(instanceId, new C3802wg(listener));
                return;
            }
            C3802wg c3802wg = this.f12238b.get(instanceId);
            if (c3802wg != null) {
                c3802wg.mo12778a(listener);
            }
        }
    }

    /* renamed from: a */
    T mo12671a(String str);

    /* renamed from: a */
    void mo12672a(T t);

    /* renamed from: a */
    void mo12673a(String str, T t);
}

package com.ironsource;

import android.app.Activity;
import com.ironsource.AbstractC3479o7;
import com.ironsource.AbstractC3514p7;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.C3390h;
import com.ironsource.mediationsdk.IronSourceSegment;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.Iterator;
import java.util.List;
import org.apache.tika.metadata.TikaCoreProperties;

/* renamed from: com.ironsource.n7 */
/* loaded from: classes2.dex */
public abstract class AbstractC3444n7<Smash extends AbstractC3479o7<?>, Listener extends AdapterAdInteractionListener> extends AbstractC3514p7<Smash, Listener> implements InterfaceC3172h2 {

    /* renamed from: com.ironsource.n7$a */
    public class a extends AbstractRunnableC3302ks {

        /* renamed from: a */
        final /* synthetic */ Activity f10379a;

        /* renamed from: b */
        final /* synthetic */ Placement f10380b;

        public a(Activity activity, Placement placement) {
            this.f10379a = activity;
            this.f10380b = placement;
        }

        @Override // com.ironsource.AbstractRunnableC3302ks
        /* renamed from: a */
        public void mo8710a() {
            AbstractC3444n7.this.m10958b(this.f10379a, this.f10380b);
        }
    }

    public AbstractC3444n7(InterfaceC3116fg interfaceC3116fg, InterfaceC3076eg interfaceC3076eg, C3682t0 c3682t0, C3840xk c3840xk, IronSourceSegment ironSourceSegment) {
        super(interfaceC3116fg, interfaceC3076eg, c3682t0, c3840xk, ironSourceSegment);
    }

    /* renamed from: a */
    private String m10952a(List<Smash> list) {
        StringBuilder sb = new StringBuilder();
        for (Smash smash : list) {
            if (smash.m11866e() != null) {
                sb.append(smash.mo9129c());
                sb.append(TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER);
                sb.append(smash.m11866e());
                sb.append(",");
            }
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public void m10958b(Activity activity, Placement placement) {
        AbstractC3479o7 abstractC3479o7;
        IronSourceError ironSourceError;
        String strM10952a;
        IronLog.INTERNAL.verbose(m11349b("state = " + this.f10783p));
        synchronized (this.f10791x) {
            try {
                this.f10776i = placement;
                this.f10786s.f7687i.m9937a(activity, m11357n());
                AbstractC3514p7.f fVar = this.f10783p;
                AbstractC3514p7.f fVar2 = AbstractC3514p7.f.SHOWING;
                abstractC3479o7 = null;
                if (fVar == fVar2) {
                    ironSourceError = new IronSourceError(C3855y1.m13120g(this.f10782o.m12333b()), "can't show ad while an ad is already showing");
                } else if (fVar != AbstractC3514p7.f.READY_TO_SHOW) {
                    ironSourceError = new IronSourceError(IronSourceError.ERROR_CODE_NO_ADS_TO_SHOW, "show called while no ads are available");
                } else if (placement == null) {
                    ironSourceError = new IronSourceError(C3855y1.m13115b(this.f10782o.m12333b()), "empty default placement");
                } else if (this.f10762E.mo9483b(ContextProvider.getInstance().getApplicationContext(), placement, this.f10782o.m12333b())) {
                    ironSourceError = new IronSourceError(C3855y1.m13119f(this.f10782o.m12333b()), "placement " + placement.getPlacementName() + " is capped");
                } else {
                    ironSourceError = null;
                }
                if (ironSourceError != null) {
                    IronLog.API.error(m11349b(ironSourceError.getErrorMessage()));
                    strM10952a = "";
                } else {
                    List listM9722b = this.f10768a.m9722b();
                    C3540px c3540px = new C3540px(this.f10782o);
                    abstractC3479o7 = (AbstractC3479o7) c3540px.m11465c(listM9722b);
                    m10957a((AbstractC3444n7<Smash, Listener>) abstractC3479o7, (List<AbstractC3444n7<Smash, Listener>>) c3540px.m11464b(listM9722b));
                    if (abstractC3479o7 != null) {
                        m11345a(fVar2);
                        m11354i(abstractC3479o7);
                    } else {
                        ironSourceError = ErrorBuilder.buildNoAdsToShowError(this.f10782o.m12333b().toString());
                        strM10952a = m10952a(listM9722b);
                    }
                }
                m10955a(ironSourceError, strM10952a);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (abstractC3479o7 != null) {
            m10953a(activity, (AbstractC3479o7<?>) abstractC3479o7, this.f10776i);
        }
    }

    @Override // com.ironsource.InterfaceC3172h2
    /* renamed from: c */
    public void mo9040c(AbstractC3479o7<?> abstractC3479o7) {
        IronLog.INTERNAL.verbose(m11349b(abstractC3479o7.m11872k()));
        this.f10787t.mo8550a();
    }

    @Override // com.ironsource.InterfaceC3172h2
    /* renamed from: d */
    public String mo9041d() {
        StringBuilder sb = new StringBuilder();
        if (this.f10783p == AbstractC3514p7.f.READY_TO_SHOW) {
            for (AbstractC3479o7 abstractC3479o7 : this.f10768a.m9722b()) {
                if (abstractC3479o7.m11883y()) {
                    sb.append(abstractC3479o7.mo9129c());
                    sb.append(";");
                }
            }
        }
        return sb.toString();
    }

    @Override // com.ironsource.AbstractC3514p7
    /* renamed from: u */
    public boolean mo10960u() {
        if (!m11361x()) {
            return false;
        }
        if (this.f10777j && !IronSourceUtils.isNetworkConnected(ContextProvider.getInstance().getApplicationContext())) {
            return false;
        }
        Iterator it = this.f10768a.m9722b().iterator();
        while (it.hasNext()) {
            if (((AbstractC3479o7) it.next()).mo11119B()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.ironsource.AbstractC3514p7
    /* renamed from: v */
    public boolean mo8201v() {
        return false;
    }

    public AbstractC3444n7(C3682t0 c3682t0, C3840xk c3840xk, IronSourceSegment ironSourceSegment) {
        super(c3682t0, c3840xk, ironSourceSegment);
    }

    /* renamed from: a */
    public void m10959a(Activity activity, Placement placement) {
        if (mo11352c()) {
            mo11346a(new a(activity, placement));
        } else {
            m10958b(activity, placement);
        }
    }

    @Override // com.ironsource.InterfaceC3172h2
    /* renamed from: b */
    public void mo9039b(AbstractC3479o7<?> abstractC3479o7) {
        IronLog.INTERNAL.verbose(m11349b(abstractC3479o7.m11872k()));
        this.f10787t.mo9415g(abstractC3479o7.m11867f());
    }

    @Override // com.ironsource.InterfaceC3172h2
    /* renamed from: d */
    public void mo9042d(AbstractC3479o7<?> abstractC3479o7) {
        IronLog.INTERNAL.verbose(m11349b(abstractC3479o7.m11872k()));
        this.f10787t.mo8554b();
    }

    /* renamed from: a */
    private void m10953a(Activity activity, AbstractC3479o7<?> abstractC3479o7, Placement placement) {
        if (this.f10782o.m12340h().m9978e()) {
            this.f10785r.m11129a();
        }
        abstractC3479o7.m11120a(activity, placement);
    }

    @Override // com.ironsource.InterfaceC3172h2
    /* renamed from: a */
    public void mo9037a(IronSourceError ironSourceError, AbstractC3479o7<?> abstractC3479o7) {
        IronLog.INTERNAL.verbose(m11349b(abstractC3479o7.m11872k() + " - error = " + ironSourceError));
        this.f10769b.put(abstractC3479o7.mo9129c(), C3390h.a.ISAuctionPerformanceFailedToShow);
        m11345a(AbstractC3514p7.f.READY_TO_LOAD);
        m10954a(ironSourceError, abstractC3479o7, "");
    }

    /* renamed from: a */
    private void m10954a(IronSourceError ironSourceError, AbstractC3479o7<?> abstractC3479o7, String str) {
        this.f10786s.f7687i.m9939a(m11357n(), ironSourceError.getErrorCode(), ironSourceError.getErrorMessage(), str);
        this.f10784q.m11080g();
        this.f10787t.mo8552a(ironSourceError, abstractC3479o7 != null ? abstractC3479o7.m11867f() : null);
        if (this.f10782o.m12340h().m9978e()) {
            m11351b(false);
        }
    }

    /* renamed from: a */
    private void m10955a(IronSourceError ironSourceError, String str) {
        m10954a(ironSourceError, (AbstractC3479o7<?>) null, str);
    }

    @Override // com.ironsource.InterfaceC3172h2
    /* renamed from: a */
    public void mo9038a(AbstractC3479o7<?> abstractC3479o7) {
        IronLog.INTERNAL.verbose(m11349b(abstractC3479o7.m11872k()));
        if (this.f10783p == AbstractC3514p7.f.SHOWING) {
            m11345a(AbstractC3514p7.f.READY_TO_LOAD);
        }
        this.f10784q.m11079f();
        this.f10787t.mo8551a(abstractC3479o7.m11867f());
    }

    /* renamed from: a */
    private void m10957a(Smash smash, List<Smash> list) {
        for (Smash smash2 : list) {
            if (smash != null && smash2 == smash) {
                smash.m11121b(true);
                return;
            }
            smash2.m11121b(false);
            IronLog.INTERNAL.verbose(m11349b(smash2.m11872k() + " - not ready to show"));
        }
    }
}

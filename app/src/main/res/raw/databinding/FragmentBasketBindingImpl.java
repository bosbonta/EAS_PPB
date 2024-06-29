package raw.databinding;
import com.shopping.app.R;
import com.shopping.app.BR;
import com.shopping.app.databinding.FragmentBasketBinding;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentBasketBindingImpl extends FragmentBasketBinding implements com.shopping.app.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.clParent, 4);
        sViewsWithIds.put(R.id.vDivider, 5);
        sViewsWithIds.put(R.id.tvTitle, 6);
        sViewsWithIds.put(R.id.rvBasketProducts, 7);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    @NonNull
    private final android.widget.TextView mboundView2;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback7;
    @Nullable
    private final android.view.View.OnClickListener mCallback8;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentBasketBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private FragmentBasketBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.Button) bindings[3]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[4]
            , (android.widget.ImageView) bindings[1]
            , (androidx.recyclerview.widget.RecyclerView) bindings[7]
            , (android.widget.TextView) bindings[6]
            , (android.view.View) bindings[5]
            );
        this.btnPurchase.setTag(null);
        this.ivClose.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView2 = (android.widget.TextView) bindings[2];
        this.mboundView2.setTag(null);
        setRootTag(root);
        // listeners
        mCallback7 = new com.shopping.app.generated.callback.OnClickListener(this, 1);
        mCallback8 = new com.shopping.app.generated.callback.OnClickListener(this, 2);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.basketFragment == variableId) {
            setBasketFragment((com.shopping.app.ui.basket.BasketFragment) variable);
        }
        else if (BR.total == variableId) {
            setTotal((java.lang.Double) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setBasketFragment(@Nullable com.shopping.app.ui.basket.BasketFragment BasketFragment) {
        this.mBasketFragment = BasketFragment;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.basketFragment);
        super.requestRebind();
    }
    public void setTotal(@Nullable java.lang.Double Total) {
        this.mTotal = Total;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.total);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        int totalInt0ViewGONEViewVISIBLE = 0;
        java.lang.String btnPurchaseAndroidStringPurchaseTotal = null;
        com.shopping.app.ui.basket.BasketFragment basketFragment = mBasketFragment;
        java.lang.Double total = mTotal;
        double androidxDatabindingViewDataBindingSafeUnboxTotal = 0.0;
        boolean totalInt0 = false;

        if ((dirtyFlags & 0x6L) != 0) {



                // read @android:string/purchase
                btnPurchaseAndroidStringPurchaseTotal = btnPurchase.getResources().getString(R.string.purchase, total);
                // read androidx.databinding.ViewDataBinding.safeUnbox(total)
                androidxDatabindingViewDataBindingSafeUnboxTotal = androidx.databinding.ViewDataBinding.safeUnbox(total);


                // read androidx.databinding.ViewDataBinding.safeUnbox(total) > 0
                totalInt0 = (androidxDatabindingViewDataBindingSafeUnboxTotal) > (0);
            if((dirtyFlags & 0x6L) != 0) {
                if(totalInt0) {
                        dirtyFlags |= 0x10L;
                }
                else {
                        dirtyFlags |= 0x8L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(total) > 0 ? View.GONE : View.VISIBLE
                totalInt0ViewGONEViewVISIBLE = ((totalInt0) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
        }
        // batch finished
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.btnPurchase, btnPurchaseAndroidStringPurchaseTotal);
            this.mboundView2.setVisibility(totalInt0ViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.btnPurchase.setOnClickListener(mCallback8);
            this.ivClose.setOnClickListener(mCallback7);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 1: {
                // localize variables for thread safety
                // basketFragment != null
                boolean basketFragmentJavaLangObjectNull = false;
                // basketFragment
                com.shopping.app.ui.basket.BasketFragment basketFragment = mBasketFragment;



                basketFragmentJavaLangObjectNull = (basketFragment) != (null);
                if (basketFragmentJavaLangObjectNull) {


                    basketFragment.dismiss();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // basketFragment != null
                boolean basketFragmentJavaLangObjectNull = false;
                // basketFragment
                com.shopping.app.ui.basket.BasketFragment basketFragment = mBasketFragment;



                basketFragmentJavaLangObjectNull = (basketFragment) != (null);
                if (basketFragmentJavaLangObjectNull) {


                    basketFragment.clearTheBasket();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): basketFragment
        flag 1 (0x2L): total
        flag 2 (0x3L): null
        flag 3 (0x4L): androidx.databinding.ViewDataBinding.safeUnbox(total) > 0 ? View.GONE : View.VISIBLE
        flag 4 (0x5L): androidx.databinding.ViewDataBinding.safeUnbox(total) > 0 ? View.GONE : View.VISIBLE
    flag mapping end*/
    //end
}
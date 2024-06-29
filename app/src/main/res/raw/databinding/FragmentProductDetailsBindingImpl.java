package raw.databinding;
import com.shopping.app.R;
import com.shopping.app.BR;
import com.shopping.app.databinding.FragmentProductDetailsBinding;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentProductDetailsBindingImpl extends FragmentProductDetailsBinding implements com.shopping.app.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.llAddBasket, 12);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback17;
    @Nullable
    private final android.view.View.OnClickListener mCallback15;
    @Nullable
    private final android.view.View.OnClickListener mCallback16;
    @Nullable
    private final android.view.View.OnClickListener mCallback14;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentProductDetailsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 13, sIncludes, sViewsWithIds));
    }
    private FragmentProductDetailsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.Button) bindings[10]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[9]
            , (android.widget.ImageView) bindings[7]
            , (android.widget.ImageView) bindings[1]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[12]
            , (android.widget.RatingBar) bindings[3]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[2]
            );
        this.btnAddBasket.setTag(null);
        this.btnIncreaseCount.setTag(null);
        this.btnReduceCount.setTag(null);
        this.ivBack.setTag(null);
        this.ivImage.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.rbRate.setTag(null);
        this.tvDesc.setTag(null);
        this.tvPrice.setTag(null);
        this.tvRate.setTag(null);
        this.tvRatingCount.setTag(null);
        this.tvTitle.setTag(null);
        setRootTag(root);
        // listeners
        mCallback17 = new com.shopping.app.generated.callback.OnClickListener(this, 4);
        mCallback15 = new com.shopping.app.generated.callback.OnClickListener(this, 2);
        mCallback16 = new com.shopping.app.generated.callback.OnClickListener(this, 3);
        mCallback14 = new com.shopping.app.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x10L;
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
        if (BR.basketCount == variableId) {
            setBasketCount((java.lang.Integer) variable);
        }
        else if (BR.dataHolder == variableId) {
            setDataHolder((com.shopping.app.data.model.Product) variable);
        }
        else if (BR.productDetailsFragment == variableId) {
            setProductDetailsFragment((com.shopping.app.ui.productdetail.ProductDetailsFragment) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((com.shopping.app.ui.productdetail.viewmodel.ProductDetailViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setBasketCount(@Nullable java.lang.Integer BasketCount) {
        this.mBasketCount = BasketCount;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.basketCount);
        super.requestRebind();
    }
    public void setDataHolder(@Nullable com.shopping.app.data.model.Product DataHolder) {
        this.mDataHolder = DataHolder;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.dataHolder);
        super.requestRebind();
    }
    public void setProductDetailsFragment(@Nullable com.shopping.app.ui.productdetail.ProductDetailsFragment ProductDetailsFragment) {
        this.mProductDetailsFragment = ProductDetailsFragment;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.productDetailsFragment);
        super.requestRebind();
    }
    public void setViewModel(@Nullable com.shopping.app.ui.productdetail.viewmodel.ProductDetailViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.viewModel);
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
        java.lang.Double dataHolderPrice = null;
        int androidxDatabindingViewDataBindingSafeUnboxBasketCount = 0;
        java.lang.Integer basketCount = mBasketCount;
        java.lang.String dataHolderRatingCountToString = null;
        java.lang.String dataHolderImage = null;
        java.lang.String tvPriceAndroidStringCurrencyUnitDataHolderPriceBasketCount = null;
        com.shopping.app.data.model.Product dataHolder = mDataHolder;
        java.lang.String tvRatingCountAndroidStringRatingCountDataHolderRatingCountToString = null;
        java.lang.String dataHolderDescription = null;
        java.lang.String dataHolderRatingRateToString = null;
        com.shopping.app.ui.productdetail.ProductDetailsFragment productDetailsFragment = mProductDetailsFragment;
        java.lang.String btnAddBasketAndroidStringAddBasketBasketCount = null;
        double dataHolderPriceBasketCount = 0.0;
        java.lang.Double dataHolderRatingRate = null;
        com.shopping.app.data.model.Rating dataHolderRating = null;
        java.lang.Integer dataHolderRatingCount = null;
        float dataHolderRatingRateFloatValue = 0f;
        double androidxDatabindingViewDataBindingSafeUnboxDataHolderPrice = 0.0;
        com.shopping.app.ui.productdetail.viewmodel.ProductDetailViewModel viewModel = mViewModel;
        java.lang.String dataHolderTitle = null;

        if ((dirtyFlags & 0x13L) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(basketCount)
                androidxDatabindingViewDataBindingSafeUnboxBasketCount = androidx.databinding.ViewDataBinding.safeUnbox(basketCount);
                if (dataHolder != null) {
                    // read dataHolder.price
                    dataHolderPrice = dataHolder.getPrice();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(dataHolder.price)
                androidxDatabindingViewDataBindingSafeUnboxDataHolderPrice = androidx.databinding.ViewDataBinding.safeUnbox(dataHolderPrice);


                // read (androidx.databinding.ViewDataBinding.safeUnbox(dataHolder.price)) * (androidx.databinding.ViewDataBinding.safeUnbox(basketCount))
                dataHolderPriceBasketCount = (androidxDatabindingViewDataBindingSafeUnboxDataHolderPrice) * (androidxDatabindingViewDataBindingSafeUnboxBasketCount);


                // read @android:string/currency_unit
                tvPriceAndroidStringCurrencyUnitDataHolderPriceBasketCount = tvPrice.getResources().getString(R.string.currency_unit, dataHolderPriceBasketCount);
            if ((dirtyFlags & 0x11L) != 0) {

                    // read @android:string/add_basket
                    btnAddBasketAndroidStringAddBasketBasketCount = btnAddBasket.getResources().getString(R.string.add_basket, basketCount);
            }
            if ((dirtyFlags & 0x12L) != 0) {

                    if (dataHolder != null) {
                        // read dataHolder.image
                        dataHolderImage = dataHolder.getImage();
                        // read dataHolder.description
                        dataHolderDescription = dataHolder.getDescription();
                        // read dataHolder.rating
                        dataHolderRating = dataHolder.getRating();
                        // read dataHolder.title
                        dataHolderTitle = dataHolder.getTitle();
                    }


                    if (dataHolderRating != null) {
                        // read dataHolder.rating.rate
                        dataHolderRatingRate = dataHolderRating.getRate();
                        // read dataHolder.rating.count
                        dataHolderRatingCount = dataHolderRating.getCount();
                    }


                    if (dataHolderRatingRate != null) {
                        // read dataHolder.rating.rate.toString()
                        dataHolderRatingRateToString = dataHolderRatingRate.toString();
                        // read dataHolder.rating.rate.floatValue()
                        dataHolderRatingRateFloatValue = dataHolderRatingRate.floatValue();
                    }
                    if (dataHolderRatingCount != null) {
                        // read dataHolder.rating.count.toString()
                        dataHolderRatingCountToString = dataHolderRatingCount.toString();
                    }


                    // read @android:string/rating_count
                    tvRatingCountAndroidStringRatingCountDataHolderRatingCountToString = tvRatingCount.getResources().getString(R.string.rating_count, dataHolderRatingCountToString);
            }
        }
        // batch finished
        if ((dirtyFlags & 0x11L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.btnAddBasket, btnAddBasketAndroidStringAddBasketBasketCount);
        }
        if ((dirtyFlags & 0x10L) != 0) {
            // api target 1

            this.btnAddBasket.setOnClickListener(mCallback16);
            this.btnIncreaseCount.setOnClickListener(mCallback17);
            this.btnReduceCount.setOnClickListener(mCallback15);
            this.ivBack.setOnClickListener(mCallback14);
        }
        if ((dirtyFlags & 0x12L) != 0) {
            // api target 1

            com.shopping.app.utils.BindingAdapters.loadImage(this.ivImage, dataHolderImage);
            androidx.databinding.adapters.RatingBarBindingAdapter.setRating(this.rbRate, dataHolderRatingRateFloatValue);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvDesc, dataHolderDescription);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvRate, dataHolderRatingRateToString);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvRatingCount, tvRatingCountAndroidStringRatingCountDataHolderRatingCountToString);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvTitle, dataHolderTitle);
        }
        if ((dirtyFlags & 0x13L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvPrice, tvPriceAndroidStringCurrencyUnitDataHolderPriceBasketCount);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 4: {
                // localize variables for thread safety
                // viewModel
                com.shopping.app.ui.productdetail.viewmodel.ProductDetailViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;
                // basketCount
                java.lang.Integer basketCount = mBasketCount;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {



                    viewModel.increaseCount(basketCount);
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // viewModel
                com.shopping.app.ui.productdetail.viewmodel.ProductDetailViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;
                // basketCount
                java.lang.Integer basketCount = mBasketCount;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {



                    viewModel.reduceCount(basketCount);
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // viewModel
                com.shopping.app.ui.productdetail.viewmodel.ProductDetailViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;
                // dataHolder
                com.shopping.app.data.model.Product dataHolder = mDataHolder;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {



                    viewModel.checkProduct(dataHolder);
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // productDetailsFragment
                com.shopping.app.ui.productdetail.ProductDetailsFragment productDetailsFragment = mProductDetailsFragment;
                // productDetailsFragment != null
                boolean productDetailsFragmentJavaLangObjectNull = false;



                productDetailsFragmentJavaLangObjectNull = (productDetailsFragment) != (null);
                if (productDetailsFragmentJavaLangObjectNull) {


                    productDetailsFragment.goBack();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): basketCount
        flag 1 (0x2L): dataHolder
        flag 2 (0x3L): productDetailsFragment
        flag 3 (0x4L): viewModel
        flag 4 (0x5L): null
    flag mapping end*/
    //end
}
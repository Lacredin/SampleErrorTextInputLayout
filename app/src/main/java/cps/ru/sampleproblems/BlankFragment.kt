package cps.ru.sampleproblems


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_blank.*


/**
 * A simple [Fragment] subclass.
 *
 */
class BlankFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_blank, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        childFragmentManager.beginTransaction().replace(R.id.fragment_passport_input_box_fragment, BlankFragment2()).commit()
        /*fragment_passport_input_button_save.setOnClickListener {
            if(fragment_passport_input_date_info.error != null){
                fragment_passport_input_date_info.error = null
                fragment_passport_input_date_info.isErrorEnabled = false
            }else{
                fragment_passport_input_date_info.isErrorEnabled = true
                fragment_passport_input_date_info.error = "Ошибка"
            }
        }*/
    }
}

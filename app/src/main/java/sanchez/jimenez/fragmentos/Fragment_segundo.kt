package sanchez.jimenez.fragmentos

import android.content.Context
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.fragment_primer.*


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Activities that contain this fragment must implement the
 * [Fragment_segundo.OnFragmentInteractionListener] interface
 * to handle interaction events.
 * Use the [Fragment_segundo.newInstance] factory method to
 * create an instance of this fragment.
 *
 */
class Fragment_segundo : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this
        val vista = inflater.inflate(R.layout.fragment_2, container, false)

        val button3 = vista.findViewById(R.id.button3) as Button
        button.setOnClickListener {
            if (etUno.text.toString().equals("") or etDos.text.toString().equals("")) {
                mensajito("Datos vacíos", Toast.LENGTH_LONG)
            } else {

                val  uno = etUno.text.toString().toInt()
                val dos = etDos.text.toString().toInt()

                val res = uno * dos
                mensajito("el resultado es: $res")
            }
        }
        return vista
    }
    fun mensajito(mensaje: String, dur:Int= Toast.LENGTH_LONG) {
        Toast.makeText(activity, mensaje, dur).show()
    }


    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment Fragment_tercero.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            Fragment_segundo().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }

    }

}

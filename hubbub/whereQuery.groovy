import com.grailsinaction.Post
import grails.util.Environment

grails.util.Environment.executeForCurrentEnvironment(new BootStrap().init)

println "There are ${Post.count()} posts in the database"

